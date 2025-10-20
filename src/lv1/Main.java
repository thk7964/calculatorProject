package lv1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("=========== 계산기 시작 ===========");
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("정수를 입력하세요(exit 입력 시 종료) : ");
            String a = sc.nextLine();
            //종료할지 안할지 확인
            if (a.equals("exit")) {//입력 받은 값이 exit인지 확인
                System.out.println("=========== 계산기 종료 ===========");
                break;

            } else if (a.matches("-?\\d+")) { //숫자인지를 판별함
                System.out.println("정수를 입력하세요:");
                String b = sc.nextLine();

                if (b.matches("-?\\d+")) {//숫자인지를 판별함
                    int num1 = Integer.parseInt(a);
                    int num2 = Integer.parseInt(b);

                    System.out.println("사칙연산을 입력하세요 : ");
                    String c = sc.nextLine();

                    switch (c) {
                        case "+"://덧셈
                            System.out.println("결과 : " + (num1 + num2));
                            break;
                        case "-"://뺄셈
                            System.out.println("결과 : " + (num1 - num2));
                            break;
                        case "*"://곱셈
                            System.out.println("결과 : " + (num1 * num2));
                            break;
                        case "/"://나눗셈
                            if (num2 != 0) {//분모가 0인지 확인
                                System.out.println("결과 : " + (double) (num1 / num2));
                            } else {
                                System.out.println("0으로 나눌 수 없습니다.");
                            }
                            break;
                        default://잘 못 입력시 출력
                            System.out.println("사칙연산이 아닙니다.");
                            break;
                    }

                } else {
                    System.out.println("정수가 아닙니다.");
                }
            } else {
                System.out.println("정수나 exit만 입력 가능합니다.\n다시 입력하세요");
            }
        }
    }
}