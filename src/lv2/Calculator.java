package lv2;

public class Calculator {

    private int result;

    public Calculator(){
        this.result = 0;
    }

    public int sum(int a, int b) {
        this.result = a + b;
        return this.result;
    }
    public int sub(int a, int b) {
        this.result = a - b;
        return this.result;
    }
    public int mul(int a, int b) {
        this.result = a * b;
        return this.result;
    }
    public int div(int a, int b) {

        if(b == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        this.result = a / b;
        return this.result;
    }



}
