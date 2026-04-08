package calculate5;

public class Calculator {

    private double num1;
    private double num2;
    private String operator;
    private double result;

    //생성자
    public Calculator(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;

    }


    // 기능
    public void calculate() {

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못되 연산자: " + operator);

        }
    }

    public double getResult() {return result; }
}
