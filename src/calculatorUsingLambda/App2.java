package calculatorUsingLambda;

import rechner.classe.Calculat;

import java.util.Scanner;

public class App2 {


    public static void main(String[] args) {
        Calculat mycal = new Calculat();
        Scanner scanner = new Scanner(System.in);

        while (true) {

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
            if (!msg.equals("y")) {
                System.out.println("계산종료");
                break;
            } else {
                System.out.println("계산 게속");
            }
        }
        scanner.close();

    }
}
