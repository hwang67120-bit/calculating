package calculate3;

public class CalculationTask {


    private double result;
    private Operator operator;
    double num1;
    double num2;

    public CalculationTask(double num1, double num2, Operator operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }


    public double getResult() {
        return result;
    }

    public void calculate() {


        switch (operator) {
            case PLUS -> result = num1 + num2;
            case MINUS -> result = num1 + num2;
            case MULTIPLY -> result = num1 + num2;
            case DIVIDE -> {
                if (num2 == 0) throw new ArithmeticException("0으로 나줄 수 없습니다");
                result = num1 / num2;
            }

        }


    }
}

