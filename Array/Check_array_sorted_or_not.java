package Array;

import java.util.Scanner;

public class Check_array_sorted_or_not {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter No: ");
            int value = input.nextInt();
            int[] array = new int[value];

            for (int i = 0; i < value; i++) {
                array[i] = input.nextInt();
            }

            boolean result = CheckSorted(array);
            System.out.print(result);
    }

    private static boolean CheckSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
