package Maths;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();
        int count = 0;
        int sum = 0;
        int original = value;
        int number = value;

        while (number > 0){
            number = number / 10;
            count++;
        }

        number = value;
        while (number > 0){
            int temp = number % 10;
            sum = (int) (Math.pow(temp,count) + sum);
            number = number / 10;
        }

        if (original == sum){
            System.out.print("Armstrong Number");
        } else {
            System.out.print("Not Armstrong Number");
        }
    }
}
