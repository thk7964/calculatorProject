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
            System.out.println("계산기 시작 = 1 , 계산기 기록 = 2 , 처음 기록된 데이터 삭제 = 3 , 종료 = exit 를 입력하시오 :  ");
            String ck = sc.nextLine();
            switch (ck) {
                case "1":
                    while (true) {
                        try {
                            System.out.println("숫자를 입력하세요: ");
                            String input1 = sc.nextLine();
                            num1 = Double.parseDouble(input1);


                            System.out.println("정수를 입력하세요:");
                            String input2 = sc.nextLine();
                            num2 = Double.parseDouble(input2);


                            System.out.println("사칙연산을 입력하세요 (+, -, *, /) : ");
                            String input3 = sc.nextLine();


                            OperatorType op = OperatorType.fromSymbol(input3);
                            System.out.println(op.getSymbol());
                            calc.calculator(num1, num2, op.getSymbol());
                            break;


                        } catch (NumberFormatException e) {
                            System.out.println("잘 못 입력했습니다.");
                        } catch (ArithmeticException | IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case "2":
                    while (true) {
                        System.out.println("기록을 확인 하시겠습니까? (Y/N)");
                        String recordinput = sc.nextLine();
                        if (recordinput.equals("Y") || recordinput.equals("y")) {
                            calc.listView();
                            break;
                        } else if (recordinput.equals("N") || recordinput.equals("n")) {
                            break;
                        } else {
                            System.out.println("형식에 맞게 입력해주세요");
                        }
                    }
                    break;
                case "3":
                    while (true) { //ArrayList 데이터 삭제

                        System.out.println("처음으로 기록된 데이터를 삭제 하시겠습니까? (Y/N)");
                        String deleteinput = sc.nextLine();
                        try {

                            if (deleteinput.equals("Y") || deleteinput.equals("y")) {
                                calc.listRemove(); // 처음 기록된 데이터를 삭제한다.
                                calc.listView();
                                break;

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
