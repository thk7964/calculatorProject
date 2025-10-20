package lv3;
// 사칙연산 종류를 정의한 enum
public enum OperatorType {
    SUM("+"),//더하기
    SUB("-"),//빼기
    MUL("*"),//곱하기
    DIV("/");//나누기

    private final String symbol;
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    //symbol이 연산자에 맞는지 확인하는 기능
    public static OperatorType fromSymbol(String symbol) {
        for (OperatorType op : OperatorType.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }//일치하는 연산자가 없을 경우 예외 발생
        throw new IllegalArgumentException("연산자가 잘못입력되었습니다.");
    }
}
