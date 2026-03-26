package rechner.classe;

public class Calculat {


    // 필드
    private int num;
    private int zahl;
    private String[] op;

    // 대상 생성자 (객체 초기화)
    public Calculat(int num, int zahl, String[] op) {
        this.num = num;
        this.zahl = zahl;
        this.op = op;

    }

    // 위임 생성자 여기에 위에 대한 정보 설명중
    public Calculat() {
        this(0, 0, new String[]{"+", "-", "*", "/"});

    }


    public String[] getOp() {
        return op;
    }

    public int getZahl() {
        return zahl;
    }

    public int getNum() {
        return num;
    }

    public void setOp(String[] op) {
        this.op = op;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public void setNum(int num) {
        this.num = num;
    }


}

