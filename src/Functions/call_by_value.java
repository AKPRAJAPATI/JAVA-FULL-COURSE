package Functions;

public class call_by_value {
    public static void main(String[] args) {
        call_by_value call_by_value = new call_by_value();
        call_by_value.add(10,20);// yaha se aapaki value call huyi hai
    }

    private void add(int i, int j) {
    int k = i+j;
        System.out.println("Basics.Addition is "+k);
    }
}
