package rechner.classe;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Calculat mycal = new Calculat();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                mycal.setNum(scanner.nextInt());

                System.out.print("연산자을 입력 하세요;");
                String op = scanner.next();
                System.out.print("두 번째 숫자을 입력하세요: ");
                mycal.setZahl(scanner.nextInt());


                int result = 0;
                boolean validOperation = true;


                switch (op) {

                    case "+":
                        result = mycal.getNum() + mycal.getZahl();
                        break;
                    case "-":
                        result = mycal.getNum() - mycal.getZahl();
                        break;
                    case "*":
                        result = mycal.getNum() * mycal.getZahl();
                        break;
                    case "/":
                        if (mycal.getZahl() != 0) {
                            result = mycal.getNum() / mycal.getZahl();
                        } else {
                            System.out.println("0으로 나눌수 없습니다. 다시 입력 하세요.");
                            validOperation = false;
                        }

                        break;

                    default:
                        System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요");
                        validOperation = false;
                        break;
                }

                if (!validOperation) {
                    continue;
                }
                System.out.println("계산기 종료(아무 키 입력 시 종료 계속 계산 할 예정이면 y을 입력해주세요.)");
                String msg = scanner.next();
                // y 입력시 계속 계산
                if (!msg.equals("y")) {
                    System.out.println("계산종료");
                    break;
                } else {
                    System.out.println("계산 게속");
                }
                // 다른 문자열을 넣을시 오류
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("잘못 입력 하셨습니다");
                System.out.println("계산기 종료(아무 키 입력 시 종료 계속 계산 할 예정이면 y을 입력해주세요.)");
                String msg = scanner.next();
                if (!msg.equals("y")) {
                    break;
                } else {
                    System.out.println("다시 시작");
                }

            }

        }
        scanner.close();
    }
}
