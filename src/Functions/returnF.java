package Functions;

public class returnF {
    public static void main(String[] args) {
        returnF retur = new returnF();
        int res = retur.add();
        System.out.println("Result is "+res);
    }

    private int add() {
    int x, y ,z;
    x = 10;
    y = 20;
    z = x +y;

    return z;
    }
}
