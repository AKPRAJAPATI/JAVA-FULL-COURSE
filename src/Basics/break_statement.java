package Basics;

public class break_statement {
    public static void main(String[] args) {

        int intArray[] = new int[]{1,2,3,4,5,6};
        System.out.println("Elements ...");
        for (int i = 0; i<=intArray.length; i++)
        {
            if (intArray[i] == 5)
            {
                break;
            }
        }
    }
}
