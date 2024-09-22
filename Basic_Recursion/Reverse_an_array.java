package Basic_Recursion;

public class Reverse_an_array {
    public static void main(String[] args) {
        int value = 5;
        int[] values = new int[]{1,2,3,4,5};
        print(values,0, value - 1);
        reverseArray(values,value);
    }

    private static void reverseArray(int[] values, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(values[i]);
        }
    }

    private static void print(int[] values, int i, int j) {
        if (i < j) {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
            print(values,i + 1, j - 1);
        }
    }
}
