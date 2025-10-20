package lv3;

import java.util.*;


public class ArithmeticCalculator<T extends Number> {

    //ArrayList 활용
    private final ArrayList<Double> results = new ArrayList<>();

    public ArithmeticCalculator() {

    }

    //계산
    public double calculate(T num1, T num2, String ch) {
        return switch (ch) {
            case "+" ->//덧셈
                    num1.doubleValue() + num2.doubleValue();
            case "-" ->//뺄셈
                    num1.doubleValue() - num2.doubleValue();
            case "*" ->//곱셈
                    num1.doubleValue() * num2.doubleValue();
            case "/" -> {//나눗셈
                if (num2.doubleValue() == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다."); //예외 의도 적으로 발생 시킴
                }
                yield num1.doubleValue() / num2.doubleValue();
            }
            default -> 0;
        };
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
    public void removeResult() {
        results.remove(0);
    }

    //입력 값과
    public void comparisonValue(double x) {
            results.stream()
                    .filter(num -> num > x)
                    .forEach(num->System.out.print(num+" "));
    }
}
