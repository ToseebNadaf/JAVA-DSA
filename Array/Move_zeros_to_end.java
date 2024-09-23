package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Move_zeros_to_end {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        int size = array.length;

        int[] answer = moveZerosToEnd(size,array);
        System.out.print(Arrays.toString(answer));
    }

    public static int[] moveZerosToEnd(int size, int[] array) {
        ArrayList<Integer> nonZeroElements = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (array[i] != 0) {
                nonZeroElements.add(array[i]);
            }
        }

        int nonZeroCount = nonZeroElements.size();

        for (int i = 0; i < nonZeroCount; i++) {
            array[i] = nonZeroElements.get(i);
        }

        for (int i = nonZeroCount; i < size; i++) {
            array[i] = 0;
        }

        return array;
    }
}
