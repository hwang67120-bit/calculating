package calculate5;

public class OperationValidator {

    public static boolean isValidForDivision(double divsor){
       return divsor != 0;
    }

    public static boolean isValidResult(double reult){
        return !Double.isNaN(reult) && !Double.isInfinite(reult);
    }

    public static boolean isPositive(double value) {
       return value > 0;
    }

    public static boolean isNonZero(double value) {
     return value != 0;
    }
}
