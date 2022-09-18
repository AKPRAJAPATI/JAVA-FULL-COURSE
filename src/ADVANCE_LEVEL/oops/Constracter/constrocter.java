package ADVANCE_LEVEL.oops.Constracter;

public class constrocter {
    int h,w,a;

    public constrocter() {
        h = 10;
        w = 10;
        a = h *w ;
        System.out.println("Res is "+a);
    }

    public static void main(String[] args) {
        constrocter constrocter = new constrocter();
    }
}
