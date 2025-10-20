package lv2;

import java.util.ArrayList;

public class Calculator {
    private static final ArrayList<Double> list = new ArrayList<>();

    private double result;
    public Calculator(){
        this.result = 0;
    }

    public int sum(int a, int b) {//더하기
        this.result = a + b;
        list.add(result);
        return (int) this.result;
    }
    public int sub(int a, int b) {//빼기
        this.result = a - b;
        list.add(result);
        return (int) this.result;
    }
    public int mul(int a, int b) {//곱하기
        this.result = a * b;
        list.add(result);
        return (int) this.result;
    }
    public double div(int a, int b) {//나누기
        if(b == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");//예외 의도 적으로 발생 시킴
        }
        this.result =(double)a / b;
        list.add(result);
        return this.result;
    }

    public void listView() {
        if (list.isEmpty()) {
            System.out.println("=====지금까지 계산한 합계 조회=====");
            System.out.println("계산한 값이 없습니다. 계산 후 이용해주세요");

        } else {
            System.out.println("=====지금까지 계산한 합계 조회=====");
            System.out.println(list);
        }
    }

    public void listRemove() {
        list.remove(0);

    }

    public double getResult() {
        return result;
    }
    public void setResult(double result) {}

}
