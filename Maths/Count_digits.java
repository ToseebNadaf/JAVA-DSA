package Maths;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();
        int count = 0;

        while (value > 0){
            value = value / 10;
            count++;
        }

        System.out.println("Count is: " + count);
    }
}
