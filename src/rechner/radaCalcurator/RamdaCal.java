package rechner.radaCalcurator;

import java.util.function.BinaryOperator;


public enum RamdaCal {
    PLUS("+", (num, zahl) -> num + zahl),
    MINUS("-", (num, zahl) -> num - zahl),
    TIMES("*", (num, zahl) -> num * zahl),
    DIVIDE("/", (num, zahl) -> {
        if (zahl == 0) return 0.0;
        return num / zahl;
    });

    private String operator;
    private final BinaryOperator<Double> expression;

    RamdaCal(String operator, BinaryOperator<Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public double calculate(double num, double zahl) {
        return this.expression.apply(num, zahl);
    }

    public static RamdaCal fromOperator(String operator) {

        for (RamdaCal op : values()) {
            if (op.operator.equals(operator)) return op;

        }
        throw new IndexOutOfBoundsException("지원하지 않는 연산자입니다: " + operator);

    }

    public String getOperator() {
        return operator;
    }

}

