package lv3;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    private double result;
    private boolean flag;


    private ArrayList<Double> list = new ArrayList<>();

    public ArithmeticCalculator() {

    }

    public void calculator(T num1, T num2, String ch) {
        switch (ch) {
            case "+":
                result = num1.doubleValue() + num2.doubleValue();
                System.out.println(result);
                list.add(result);

                break;
            case "-":
                result = num1.doubleValue() - num2.doubleValue();
                System.out.println(result);
                list.add(result);
                break;
            case "*":
                result = num1.doubleValue() * num2.doubleValue();
                System.out.println(result);
                list.add(result);
                break;
            case "/":
                if (num2.doubleValue() == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");//예외 의도 적으로 발생 시킴
                }
                result = num1.doubleValue() / num2.doubleValue();
                System.out.println(result);
                list.add(result);
                break;
        }
    }


}
