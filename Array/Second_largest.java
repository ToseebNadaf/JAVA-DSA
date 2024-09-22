package Array;

import java.util.Scanner;

public class Second_largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();
        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        int result = largestElement(array);
        System.out.println("Second large Element is: " + result);
    }

    private static int largestElement(int[] array) {
        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                second_large = largest;
                largest = array[i];
            } else if (array[i] > second_large && array[i] != largest) {
                second_large = array[i];
            }
        }

        return second_large;
    }
}
