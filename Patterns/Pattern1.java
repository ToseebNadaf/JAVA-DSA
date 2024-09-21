package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
