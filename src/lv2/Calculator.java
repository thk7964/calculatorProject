package lv2;

import java.util.ArrayList;

public class Calculator {
    private static final ArrayList<Double> results = new ArrayList<>();

    public Calculator() {

    }

    public double sum(double a, double b) {//더하기
        return a + b;
    }

    public double sub(double a, double b) {//빼기
        return a - b;
    }

    public double mul(double a, double b) {//곱하기
        return a * b;
    }

    public double div(double a, double b) {//나누기
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");//예외 의도 적으로 발생 시킴
        }

        return  a / b;
    }

    //연산 결과값 기록 세터
    public void addResults(double result) {
        results.add(result);
    }

    //연산기록 조회 게터
    public ArrayList<Double> getResults() {
        return results;
    }

    //처음 저장한 결과 값 삭제
    public void listRemove() {
        results.remove(0);
    }


}
