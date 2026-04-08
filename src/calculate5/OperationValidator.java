package calculate5;

public class OperationValidator {

    //나누기 가능한지 확인 (0이 아닌지)
    public static boolean isValidForDivision(double divsor){
       return divsor != 0;
    }

    //계산 결과가 정상 숫자인지 확인
    public static boolean isValidResult(double reult){
        return !Double.isNaN(reult) && !Double.isInfinite(reult);
    }

    //양수인지 확인
    public static boolean isPositive(double value) {
       return value > 0;
    }

    public static boolean isNonZero(double value) {
     return value != 0;
    }
}
