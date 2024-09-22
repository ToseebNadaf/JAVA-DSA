package Basic_Recursion;

public class Factorial_of_N_numbers {
    public static void main(String[] args) {
        int value = 4;
        int ans = print(value);
        System.out.println(ans);
    }

    private static int print(int value) {
        if (value == 0) {
            return 1;
        }

        return value * print(value - 1);
    }
}
