package newCalcutate;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Generation generation = new Generation(); // 새로운 계산기 생성

        CalculationData attribute = new CalculationData(); // 계산값 저장 밋 수정

        Scanner sc = new Scanner(System.in); //스캔너

        ExceptionHandling ex = new ExceptionHandling(sc);//에외처리

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

        double result = generation.getResult();

        System.out.println(" 계산 결과: " + result);
        System.out.println("계산기 종료(아무 키 입력 시 종료 계속 계산 할 예정이면 y을 입력해주세요.)");

        ex.handing();

        sc.close();
    }
}