package calculate5;

import java.util.Scanner;

public class InputValidator {

    //문자열이 숫자로 변환 가능한지 확인
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

    //유효한 숫자가 입력될 때까지 계속 요청
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
        //유효한 연산자(+, -, *, /)가 입력될 때까지 계속 요청
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
