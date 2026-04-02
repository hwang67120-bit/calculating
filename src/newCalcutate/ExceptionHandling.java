package newCalcutate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    //스캔너
    private Scanner scanner;

    //생성자
    public ExceptionHandling(Scanner scanner){
        this.scanner = scanner;

    }

    //에외 처리
    public void handing(){
        while (true) {
            try {
                String msg = scanner.next();


                // y 입력시 계속 계산
                if (!msg.equals("y")) { //! NOT 을 사용해 y 제외한 모든 입력은 종료
                    System.out.println("계산종료");
                    break;
                }
            } catch (InputMismatchException e) { // 예외 처리
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
    }

}
