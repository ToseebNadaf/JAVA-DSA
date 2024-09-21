package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        for (int i = 1; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('C' - j));
            }

            System.out.println();
        }
    }
}
