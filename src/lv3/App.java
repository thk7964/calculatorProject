package lv3;


import java.util.*;


public class App {
    public static void main(String[] args) {

        //ArrayList 활용
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("=========== 계산기 시작 ===========");
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calc = new ArithmeticCalculator();
        while (true) {

            boolean flag = false;
            double result = 0;
            boolean flag2 = true;

            System.out.println("계산기 시작 = 1 , 계산기 기록 = 2 , 처음 기록된 데이터 삭제 = 3 , 종료 = exit 를 입력하시오 :  ");
            String ck = sc.nextLine();
            switch (ck) {
                case "1":
                    System.out.println("정수를 입력하세요: ");
                    String input1 = sc.nextLine();


                    System.out.println("정수를 입력하세요:");
                    String input2 = sc.nextLine();

                    System.out.println("사칙연산을 입력하세요 (+, -, *, /) : ");
                    String input3 = sc.nextLine();


                    double num1 = Double.parseDouble(input1);
                    double num2 = Double.parseDouble(input2);
                    try {
                        OperatorType op = OperatorType.fromSymbol(input3);
                        System.out.println(op.getSymbol());
                        calc.calculator(num1, num2, op.getSymbol());


                    } catch (ArithmeticException | IllegalArgumentException e) {
                        System.out.println(e.getMessage());

                    }
                    break;

                case "2":
                    while (true) {
                        System.out.println("기록을 확인 하시겠습니까? (Y/N)");
                        String recordinput = sc.nextLine();
                        if (recordinput.equals("Y") || recordinput.equals("y")) {
                            System.out.println("기록");
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
