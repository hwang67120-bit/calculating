package rechner.classe;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Calculat mycal = new Calculat();
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        mycal.setNum(scanner.nextInt());

        System.out.print("연산자을 입력 하세요;");
        String op = scanner.next();

        System.out.print("두 번째 숫자을 입력하세요: ");
        mycal.setZahl(scanner.nextInt());

        int result = 0;

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
                result = mycal.getNum() / mycal.getZahl();
                break;
        }

        System.out.println("결과: " + result);

        scanner.close();

    }



}
