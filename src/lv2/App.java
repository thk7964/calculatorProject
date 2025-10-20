package lv2;

import java.util.Scanner;

public class App {
    //ArrayList 활용

    public static void main(String[] args) {

        System.out.println("=========== 계산기 시작 ===========");
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            boolean flag = false;//삭제 및 조회 기능 컨트롤

            System.out.println("정수를 입력하세요(exit 입력 시 종료) : ");
            String input1 = sc.nextLine();

            //종료할지 안할지 확인
            if (input1.equals("exit")) {//입력 받은 값이 exit인지 확인
                System.out.println("=========== 계산기 종료 ===========");
                break;

            } else if (input1.matches("-?\\d+")) { //숫자인지 확인
                System.out.println("정수를 입력하세요:");
                String input2 = sc.nextLine();

                if (input2.matches("-?\\d+")) { //숫자인지 확인
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    double result = 0;
                    boolean flag2 = true; //결과 값저장 기능 컨트롤

                    System.out.println("사칙연산을 입력하세요 (+, -, *, /) : ");
                    String c = sc.nextLine();

                    try {
                        switch (c) {
                            case "+"://덧셈
                                result = calc.sum(num1, num2);
                                break;
                            case "-"://뺄셈
                                result=calc.sub(num1, num2);
                                break;
                            case "*"://곱하기
                                result = calc.mul(num1, num2);
                                break;
                            case "/"://나누기
                                result = calc.div(num1, num2);
                                break;
                            default:
                                System.out.println("사칙연산이 아닙니다.");
                                flag2 = false;
                                break;
                        }
                    } catch (ArithmeticException e) {// 잘못 입력했을 경우 예외처리
                        System.out.println(e.getMessage());
                        flag2 = false;
                    }

                    if (flag2) {//ArrayList 데이터 추가
                        System.out.println("결과 : " + result);
                        calc.addResults(result);
                        flag = true;
                    }

                } else {
                    System.out.println("정수가 아닙니다.");
                }
            } else {
                System.out.println("정수나 exit만 입력 가능합니다.\n다시 입력하세요");
            }

            while (flag) {//계산을 안하면 안보이게 설정
                System.out.println("기록을 확인 하시겠습니까? (Y/N)");
                String input3 = sc.nextLine();
                if (input3.equals("Y") || input3.equals("y")) {
                    if (calc.getResults().isEmpty()) {
                        System.out.println("=====지금까지 계산한 합계 조회=====");
                        System.out.println("계산한 값이 없습니다. 계산 후 이용해주세요");

                    } else {
                        System.out.println("=====지금까지 계산한 합계 조회=====");
                        System.out.println(calc.getResults());
                    }
                    break;
                } else if (input3.equals("N") || input3.equals("n")) {
                    break;
                } else {
                    System.out.println("형식에 맞게 입력해주세요");
                }
            }
            //계산을 안하면 안보이게 설정
            //ArrayList 데이터 삭제
            while (flag) {
                System.out.println("처음으로 기록된 데이터를 삭제 하시겠습니까? (Y/N)");
                String input4 = sc.nextLine();
                if (input4.equals("Y") || input4.equals("y")) {
                    calc.listRemove(); // 처음 기록된 데이터를 삭제한다.
                    System.out.println("=====지금까지 계산한 합계 조회=====");
                    System.out.println(calc.getResults());
                    break;

                } else if (input4.equals("N") || input4.equals("n")) {
                    break;
                } else {
                    System.out.println("형식에 맞게 입력해주세요");
                }
            }
        }
    }
}