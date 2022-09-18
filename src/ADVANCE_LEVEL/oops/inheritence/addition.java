package ADVANCE_LEVEL.oops.inheritence;

class Addition{
    void add()
    {
        int x, y=10,z=10;
        x = y+z;
        System.out.println("Res is "+x);
    }
}
class Subtraction extends Addition
{
    void sub ()
    {
        int x, y=10,z=10;
        x = y-z;
        System.out.println("Res is "+x);
    }
}class devision extends Subtraction{
    void div()
    {
        int x, y=10,z=10;
        x = y/z;
        System.out.println("Res is "+x);
    }
}
class Multiply extends devision
{
    void mul ()
    {
        int x, y=10,z=10;
        x = y*z;
        System.out.println("Res is "+x);
    }
}

public class addition {
    public static void main(String[] args) {
        Multiply multiply  = new Multiply();
        multiply.mul();
        multiply.add();
        multiply.div();
        multiply.sub();
    }
}
