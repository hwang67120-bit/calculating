package newCalcutate;


public class Generation {

    // Attribute 클라스을 지정
    private CalculationData attribute; // 여기 num1, op, num2, 정보 저장
    private double result;



    public double getResult() { // 저장된 값을 보여주기 위해서 getter 추가
        return result;
    }

    public void setAttribute(CalculationData attribute) { // 값을 수정 하기 위해서 setter 추가
        this.attribute = attribute;
    }

    /** 계산기 기능 **/
    public void calculat() {

        boolean validOperation;

        switch (attribute.getOp()) {

            case "+":
                result = attribute.getNum1() + attribute.getNum2();
                break;
            case "-":
                result = attribute.getNum1() - attribute.getNum2();
                break;
            case "*":
                result = attribute.getNum1() * attribute.getNum2();
                break;
            case "/":
                if (attribute.getNum2() != 0) {
                    result = attribute.getNum1() / attribute.getNum2();
                } else {
                    System.out.println("0으로 나눌수 없습니다.");
                    validOperation = false;
                }
                break;
                // 연산기호 입력시 다시 입력
            default:
                System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요");
                validOperation = false;
                break;


        }
    }
}


