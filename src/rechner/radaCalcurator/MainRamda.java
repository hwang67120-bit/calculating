package rechner.radaCalcurator;

import rechner.classe.Calculat;

import java.util.Scanner;

public class MainRamda<T extends Number>{

    public double execute(T num, String op, T zahl) {
        RamdaCal ramdaCal = RamdaCal.fromOperator(op);

        return ramdaCal.calculate(num.doubleValue(), zahl.doubleValue());
    }

    public static void main(String[] args) {

        MainRamda<Double> mainRamda = new MainRamda<>();

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num = scanner.nextDouble();

            System.out.print("연산자을 입력 하세요;");
            String op = scanner.next();

            System.out.print("두 번째 숫자을 입력하세요: ");
            double zahl = scanner.nextDouble();

            double result = mainRamda.execute(num, op, zahl);

            System.out.println("결과: " + result);
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        } finally {
            scanner.close();

        }

    }
}
