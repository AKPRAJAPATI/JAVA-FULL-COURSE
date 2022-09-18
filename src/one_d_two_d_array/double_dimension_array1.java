package one_d_two_d_array;

public class double_dimension_array1 {
    public static void main(String[] args) {
        int array[][] =
                {
                        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}

                };

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
