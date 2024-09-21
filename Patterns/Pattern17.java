package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        for (int i = 1; i <= value; i++) {
            for (int j = i; j < value; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }

            System.out.println();
        }
    }
}
