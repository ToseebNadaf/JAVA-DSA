package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        for (int i = value; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (value - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (value - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
