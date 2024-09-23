package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_array_to_left_one_place {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        int[] answer = rotate(array);
        System.out.print(Arrays.toString(answer));
    }

    private static int[] rotate(int[] array) {
        int temp = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        array[array.length - 1] = temp;

        return array;
    }
}
