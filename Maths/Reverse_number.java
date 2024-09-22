package Maths;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();
        int reverse = 0;
        int temp = 0;

        while (value > 0){
            temp = value % 10;
            reverse = reverse * 10 + temp;
            value = value / 10;
        }

        System.out.print("Reverse: " + reverse);
    }
}
