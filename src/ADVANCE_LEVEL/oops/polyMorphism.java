package ADVANCE_LEVEL.oops;

class poly{
    void a()
    {
        System.out.println("NO Parameter");
    }
    void a(int i)
    {
        System.out.println("Integer parameter");
    }
    void a (char ch)
    {
        System.out.println("Character parameter");
    }
}

public class polyMorphism {
    public static void main(String[] args) {
        poly poly = new poly();
        poly.a();
        poly.a(2);

    }
}
