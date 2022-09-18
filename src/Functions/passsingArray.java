package Functions;

public class passsingArray {
    public static void main(String[] args) {
        int intArray[] = {1,23,4,5,6,9};
        passsingArray passsingArray = new passsingArray();
        passsingArray.PassMyArray(intArray);
    }

    private void PassMyArray(int[] intArray) {
    int sum =  0;
    for (int i = 0; i<intArray.length; i++)
    {
        sum = sum + intArray[i];
        System.out.println("Total number is "+sum);
    }
    }
}
