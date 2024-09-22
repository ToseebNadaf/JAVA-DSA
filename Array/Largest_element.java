package Array;

import java.util.Scanner;

public class Largest_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();
        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        int result = largestElement(array);
        System.out.println("Large Element is: " + result);
    }

    private static int largestElement(int[] array) {
        int largest = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (largest < array[i]){
                largest = array[i];
            }
        }
        return largest;
    }
}
