package Maths;

import java.util.Scanner;

public class Print_divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        for (int i = 1; i <= value; i++) {
            if (value % i == 0){
                System.out.println("Divisor is: " + i);
            }
        }
    }
}
