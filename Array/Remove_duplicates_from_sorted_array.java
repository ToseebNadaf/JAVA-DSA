package Array;

import java.util.Scanner;

public class Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        int answer = removeDuplicates(array);
        System.out.print("Length is: " + answer);
    }

    private static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                array[i + 1] = array[j];
                i++;
            }
        }

        return i + 1;
    }
}
