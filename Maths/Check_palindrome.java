package Maths;

import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();
        int original = value;
        int reverse = 0;

        while (value > 0){
            int temp = value % 10;
            reverse = reverse * 10 + temp;
            value = value / 10;
        }

        if (original == reverse){
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}
