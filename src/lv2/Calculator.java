package lv2;

public class Calculator {

    private int result;

    public Calculator(){
        this.result = 0;
    }

    public int sum(int a, int b) {//더하기
        this.result = a + b;
        return this.result;
    }
    public int sub(int a, int b) {//빼기
        this.result = a - b;
        return this.result;
    }
    public int mul(int a, int b) {//곱하기
        this.result = a * b;
        return this.result;
    }
    public int div(int a, int b) {//나누기

        if(b == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");//예외 의도 적으로 발생 시킴
        }
        this.result = a / b;
        return this.result;
    }



}
