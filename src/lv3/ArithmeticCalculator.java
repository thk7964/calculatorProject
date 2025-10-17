package lv3;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    private double result=0;

    //ArrayList 활용
    private final ArrayList<Double> list = new ArrayList<>();

    public ArithmeticCalculator() {

    }

    public void calculator(T num1, T num2, String ch) {
        switch (ch) {
            case "+":
                this.result = num1.doubleValue() + num2.doubleValue();
                System.out.println("값은 : "+this.result);
                list.add(this.result);

                break;
            case "-":
                this.result = num1.doubleValue() - num2.doubleValue();
                System.out.println("값은 : "+this.result);
                list.add(this.result);
//                flag = true;
                break;
            case "*":
                this.result = num1.doubleValue() * num2.doubleValue();
                System.out.println("값은 : "+this.result);
                list.add(this.result);

                break;
            case "/":
                if (num2.doubleValue() == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");//예외 의도 적으로 발생 시킴
                }
                this.result = num1.doubleValue() / num2.doubleValue();
                System.out.println("값은 : "+this.result);
                list.add(this.result);

                break;
        }
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

}
