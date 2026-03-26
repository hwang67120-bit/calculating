package calculatorUsingLambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public enum OperatorType {

    PLUS("+", (x, y) ->  x + y),
    MINUS("-", (x, y) -> x - y),
    MULTIPLY("*", (x, y) ->( x * y)),
    DIVIDE("/", (x, y) -> (x / y));


    private final String operator;
    private final BiFunction<Double, Double, Double> function;

    OperatorType(String operator, BiFunction<Double, Double, Double> function) {
        this.operator = operator;
        this.function = function;

    }

    public Double Calculate(Number x, Number y) {
        return function.apply(x.doubleValue(), y.doubleValue());
    }

    @Override
    public String toString() {
        return operator;
    }
}