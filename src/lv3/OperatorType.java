package lv3;

public enum OperatorType {
    SUM("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String symbol;
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    public static OperatorType fromSymbol(String symbol) {
        for (OperatorType op : OperatorType.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("연산자가 잘못입력되었습니다.");
    }
}
