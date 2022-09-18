package Functions;

public class add_two_no {
    public static void main(String[] args) {
        add_two_no add = new add_two_no();
        add.AddTwoNumber(1, 3);
    }

    private void AddTwoNumber(int i, int i1) {
        int j = i + i1;
        System.out.println("Res " + j);
    }
}
