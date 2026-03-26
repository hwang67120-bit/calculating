package calculate3;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultList  = new ArrayList<>();


        while (true) {
            try {

                System.out.println("첫 번째 숫자: ");
                double num1 = scanner.nextDouble();

                System.out.println("연산기호 입력해주세요: ");
                String operator = scanner.next();

                /**String operate에서 기호을 입력시 +,-,*,/ 을 enum을 찿아서 반환 그래서 operator 변수에 enum 정보가 담김 **/
                Operator operate = Operator.fromSymbol(String.valueOf(operator));// enum에 있는 데이터 가져오고 저장하기 위해서 추가

                System.out.println("두 번쨰 숫자: ");
                double num2 = scanner.nextDouble();


                CalculationTask attirbute = new CalculationTask(num1, num2, operate);

                attirbute.calculate(); //계산기 호출

                resultList.add(attirbute.getResult()); // 계산 값을 result 여다가 저장

                System.out.println("게산결과" + attirbute.getResult());// 결과 값 하나남 저장해서 보여줌
                System.out.println("전체 계산 기록: " + resultList); // 위에서 계산 된 값이 리스트로 나열 되서 저장[]



            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요");
                scanner.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("에러" + e.getMessage());
            }

            System.out.println("계속하시겠습니까? (종료 하겠습니까?(no) 계속 하시겠습니다까?(아무키): ");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("no")) break;


        }
        /** 위에서 나온 결과 값을 전부 합쳐서 더한 값 **/
        double toltalSum =0;
        for (Double val : resultList) { // resultList에 있는 값을 하나씩 val에 닶아서
            toltalSum += val; // val 에 있는 값을 더해서 totalSum에 다가 넣음
        }
        System.out.println("모든 계산 결과 합계: " + toltalSum);

        scanner.close();
        System.out.println("프로그램 종료");
    }
}
