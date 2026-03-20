package rechner;


import java.util.Scanner;

public class Calculating {

    public static void main(String[] args) {


        //입력을 받기 위한 출력
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int nun1 = scanner.nextInt();

        System.out.print("연산자을 입력 하세요;");
        String operator = scanner.next();

        System.out.print("두 번째 숫자을 입력하세요: ");
        int num2 = scanner.nextInt();

        int db = 0;

        switch (operator) {
            case "+":
                db = nun1 + num2;
                break;
            case "-":
                db = nun1 - num2;
                break;
            case "*":
                db = nun1 * num2;
                break;
            case "/":
                db = nun1 - num2;
                break;
        }

        System.out.println("결과: " + db);

        scanner.close();
    }


}
