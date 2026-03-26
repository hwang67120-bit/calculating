package calculatorUsingLambda;

public class ArithmeticCalculator <T extends Number>{

    public double calculate(T x, T y, OperatorType operator) {
        return operator.Calculate(x, y);
    }
}
