package lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ArrayList 활용
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("=========== 계산기 시작 ===========");
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (true) {

            System.out.println("정수를 입력하세요(exit 입력 시 종료) : ");
            String input1 = sc.nextLine();
            //종료할지 안할지 확인
            if (input1.equals("exit")) {//입력 받은 값이 exit인지 확인
                System.out.println("=========== 계산기 종료 ===========");
                break;

            } else if (input1.matches("-?\\d+")) { //숫자인지를 판별함
                System.out.println("정수를 입력하세요:");
                String input2 = sc.nextLine();

                if (input2.matches("-?\\d+")) {
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);

                    System.out.println("사칙연산을 입력하세요 (+, -, *, /) : ");
                    String c = sc.nextLine();

                    switch (c) {
                        case "+" :
                            System.out.println("결과 : " + calc.sum(num1,num2));
                            list.add(calc.sum(num1,num2));
                            break;
                        case "-" :
                            System.out.println("결과 : " + calc.sub(num1,num2));
                            list.add(calc.sub(num1,num2));
                            break;
                        case "*" :
                            System.out.println("결과 : " + calc.mul(num1,num2));
                            list.add(calc.mul(num1,num2));
                            break;
                        case "/" :
                            if(num2 != 0){
                                System.out.println("결과 : " + calc.div(num1,num2));
                                list.add(calc.div(num1,num2));
                            }
                            else {
                                System.out.println("0으로 나눌 수 없습니다.");
                            }
                            break;
                        default :
                            System.out.println("사칙연산이 아닙니다.");
                            break;
                    }

                } else {
                    System.out.println("정수가 아닙니다.");
                }
            } else {
                System.out.println("정수나 exit만 입력 가능합니다.\n다시 입력하세요");
            }
            System.out.println("기록을 확인 하시겠습니까? (Y/N)");
            String input3 = sc.nextLine();
            while (true) {
                if (input3.equals("Y") || input3.equals("y")) {
                    System.out.println("=====지금까지 계산한 합계 조회=====");
                    System.out.println(list);
                    break;
                }
                else if (input3.equals("N")|| input3.equals("n")) {
                    break;
                }
                else {
                    System.out.println("형식에 맞게 입력해주세요");
                }
            }

        }
    }


}