package calculate5;

import java.util.Scanner;

public class InputValidator {

    public static boolean isValidNumber(String input) {

        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidOperator(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }

    public static double getValidNumber(Scanner scanner) {
        String input  = "";

        while (true) {
            System.out.println("숫자입력: ");
            input  = scanner.next();

            if (isValidNumber(input)) {
                return Double.parseDouble(input);
            } else {
                System.out.println("숫자만 입력하세요");
            }
        }
    }

        public static String getValidOperator (Scanner scanner){
            String operator;

            while (true){
                System.out.println("연산자 입력: ");
                operator = scanner.next();
                if (isValidOperator(operator)) {
                    return operator;
                }
                else {
                    System.out.println("올바른 연산자를 입력하세요");
                }
            }

        }

    }
