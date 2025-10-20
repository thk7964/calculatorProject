package lv3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        double num1;
        double num2;

        System.out.println("=========== 계산기 시작 ===========");
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calc = new ArithmeticCalculator();

        while (true) {
            System.out.println("계산기 시작 = 1, 계산기 기록 = 2, 처음 기록된 데이터 삭제 = 3, 기준 값보다 큰지 확인 = 4, 종료 = exit 를 입력하시오 :  ");
            String ck = sc.nextLine();
            switch (ck) {
                // 두수 계산(사칙연산)
                case "1":
                    while (true) {
                        try {
                            System.out.println("숫자를 입력하세요: ");
                            String input1 = sc.nextLine();
                            num1 = Double.parseDouble(input1);

                            System.out.println("숫자를 입력하세요:");
                            String input2 = sc.nextLine();
                            num2 = Double.parseDouble(input2);

                            System.out.println("사칙연산을 입력하세요 (+, -, *, /) : ");
                            String input3 = sc.nextLine();

                            //사칙연산자 비교
                            OperatorType op = OperatorType.fromSymbol(input3);
                            //사칙연산 값 확인 및 저장
                            double result = calc.calculate(num1, num2, op.getSymbol());
                            calc.addResults(result);
                            System.out.println("값은 :" + result);
                            break;


                        } catch (NumberFormatException e) { // 잘못 입력했을 경우 예외처리
                            System.out.println("잘 못 입력했습니다.");
                        } catch (ArithmeticException | IllegalArgumentException e) { // 잘못 입력했을 경우 예외처리
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                //계산 기록 조회
                case "2":
                    while (true) {
                        System.out.println("기록을 확인 하시겠습니까? (Y/N)");
                        String recordinput = sc.nextLine();
                        if (recordinput.equals("Y") || recordinput.equals("y")) {
                            if (calc.getResults().isEmpty()) { //이전에 계산한 값이 있는지 확인
                                System.out.println("계산한 값이 없습니다. 계산 후 이용해주세요");
                                break;
                            }
                            else{
                                System.out.println("=====계산 결과 조회=====");
                                System.out.println(calc.getResults());
                                break;
                            }
                        } else if (recordinput.equals("N") || recordinput.equals("n")) {
                            break;
                        } else {
                            System.out.println("형식에 맞게 입력해주세요");
                        }
                    }
                    break;
                //계산 기록 삭제(처음 저장한 데이터 값 삭제)
                case "3":
                    while (true) { //ArrayList 데이터 삭제

                        System.out.println("처음으로 기록된 데이터를 삭제 하시겠습니까? (Y/N)");
                        String deleteinput = sc.nextLine();
                        try {
                            if (deleteinput.equals("Y") || deleteinput.equals("y")) {
                                if (calc.getResults().isEmpty()) { //이전에 계산한 값이 있는지 확인
                                    System.out.println("계산한 값이 없습니다. 계산 후 이용해주세요");
                                    break;
                                }
                                else {
                                    calc.removeResult(); // 처음 기록된 데이터를 삭제한다.
                                    System.out.println("=====계산 결과 조회=====");
                                    System.out.println(calc.getResults());
                                    break;
                                }

                            } else if (deleteinput.equals("N") || deleteinput.equals("n")) {
                                break;
                            } else {
                                System.out.println("형식에 맞게 입력해주세요");
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("삭제할 값이 없습니다.");
                            break;
                        }
                    }
                    break;
                //입력한 값과 계산된 값 비교
                case "4":
                    try {
                        if (calc.getResults().isEmpty()) { //이전에 계산한 값이 있는지 확인
                            System.out.println("계산한 값이 없습니다. 계산 후 이용해주세요");
                        } else {
                            System.out.println("비교할 값을 입력해주세요 : ");
                            String input4 = sc.nextLine();
                            double someNum = Double.parseDouble(input4);
                            System.out.println(someNum + "보다 큰 결과 값들은 :");
                            calc.comparisonValue(someNum);
                            System.out.println(" ");
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("값을 잘 못 입력했습니다.");
                        break;
                    }
                //계산기 종료
                case "exit"://입력 받은 값이 exit인지 확인
                    System.out.println("=========== 계산기 종료 ===========");
                    return;

                default:
                    System.out.println("형식에 맞게 입력해주세요.");
                    break;

            }
        }
    }
}
