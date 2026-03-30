package newCalcutate;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Generation generation = new Generation(); // 새로운 계산기 생성

        CalculationData attribute = new CalculationData();
        Scanner sc = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("첫번째 숫자을 입력 하세요: ");
                double num1 = sc.nextDouble();// 입력 받을시 Attribute 있는 num에 저장 됨

                System.out.println("연산기호을 입력 하세요: ");
                String op = sc.next();

                System.out.println("두 번째 숫자을 입력 하세요: ");
                double num2 = sc.nextDouble();

                attribute.setNum1(num1); // 위 에서 받은 입력값은 Attribute 클래스에 저장
                                            //set로 수정
                attribute.setNum2(num2);
                attribute.setOp(op);

                generation.setAttribute(attribute); //초기화
                /** Exception in thread "main" java.lang.NullPointerException:
                 *  Cannot invoke "newCalcutate.Attribute.getOp()"
                 * because "this.attribute" is null
                 *받는 곳 없으면 오류 뜸
                 **/
                generation.calculat(); // 계산기 호출
                double result = generation.getResult(); // 결과 값을 담을 객체 호출 Generation -> double result에 담김

                System.out.println(" 계산 결과: " + result);
                System.out.println("계산기 종료(아무 키 입력 시 종료 계속 계산 할 예정이면 y을 입력해주세요.)");
                String msg = sc.next();


                // y 입력시 계속 계산
                if (!msg.equals("y")) { //! NOT 을 사용해 y 제외한 모든 입력은 종료
                    System.out.println("계산종료");
                    break;
                }
            } catch (InputMismatchException e) { // 예외 처리
                sc.nextLine();
                System.out.println("잘못 입력 하셨습니다");
                System.out.println("계산기 종료(아무 키 입력 시 종료 계속 계산 할 예정이면 y을 입력해주세요.)");
                String msg = sc.next();
                if (!msg.equals("y")) {
                    break;

                } else {
                    System.out.println("다시 시작");
                }


            }

        }
        sc.close();
    }
}