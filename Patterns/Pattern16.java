package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        for (int i = value; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }

            System.out.println();
        }
    }
}
