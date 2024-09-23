package Array;

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
        System.out.print("Final arrays is: " + Arrays.toString(answer));
    }

    public static int[] moveZerosToEnd(int size, int[] array) {
        int zeroPointer = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == 0){
                zeroPointer = i;
                break;
            }
        }

        if (zeroPointer == -1) return array;

        for (int i = zeroPointer + 1; i < size; i++) {
            if (array[i] != 0){
                int temp = array[i];
                array[i] = array[zeroPointer];
                array[zeroPointer] = temp;
                zeroPointer++;
            }
        }

        return array;
    }
}
