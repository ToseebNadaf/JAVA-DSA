package Bit_Manipulation;

import java.util.Arrays;

public class Swap_numbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int[] result = swap(a,b);
        System.out.print("Output: " + Arrays.toString(result));
    }

    private static int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[] {a,b};
    }
}
