import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("=========== 계산기 시작 ===========");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("정수를 입력하세요(exit 입력 시 종료) : ");
            String a = sc.nextLine();

            //종료할지 안할지 확인
            if (a.equals("exit")) {
                System.out.println("=========== 계산기 종료 ===========");
                break;

            } else{
                System.out.println("입력 받은 값: "+a);
            }
        }
    }
}