package calculate3;

public enum Operator {


    // 연산 기호 및 계산기
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;


    Operator(String symbol) {
        this.symbol = symbol;
    }

/** 사용자가 연산자을 넣을 때마다  enum문자로 반환 시켜서 돌려준다  **/
    public static Operator fromSymbol(String input) {
        for (Operator operator : Operator.values()) {
            if (operator.symbol.equals(input)) {
                return operator;
            }
        }

        throw new IllegalArgumentException("해당하는 연산기호가 없습니다" + input);
    }
}