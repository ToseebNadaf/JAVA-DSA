package Basic_Recursion;

import java.util.Scanner;

public class Print_N_times {
    static int count = 0;

    public static void print() {
        if (count == 3) return;
        System.out.println(count);

        count = count + 1;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
