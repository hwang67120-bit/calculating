package calculate5;

import java.util.Scanner;

public class Main {

    //시작 마인메서드
    public static void main(String[] args) {
        //스캔너 생성
        Scanner sc = new Scanner(System.in);
        // ResultManger 객체 새로 생성
        ResultManager re = new ResultManager();

        //게산기
        while (true) {

            double num1;

            double num2;

            String op;

            double result;

            try {
                //입력
                num1 = InputValidator.getValidNumber(sc);
                op = InputValidator.getValidOperator(sc);
                num2 = InputValidator.getValidNumber(sc);

                //계산
                Calculator calculator = new Calculator(num1, num2, op);

                calculator.calculate();
                result = calculator.getResult();

                //결과 정장 및 출력
                re.addResult(result);
                System.out.println("결과: " + result);
                System.out.println("전체기록: " + re.getResultList());

            } catch (Exception e) {

                System.out.println("오류" + e.getMessage());
            }


            //게속 여부

            String answer;

            System.out.println("\n 게속? (종료:no / 게속:아무키");
            sc.nextLine();
            answer = sc.nextLine();

            if (answer.equals("no")){
                break;
            }



        }
        //최종 통계
        re.printStatistics();

        sc.close();
        System.out.println("시스템 종료");





    }
}
