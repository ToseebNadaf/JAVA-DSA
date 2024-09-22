package Basic_Recursion;

public class Sum_of_first_N_numbers {
    static int sum = 0;
    public static void main(String[] args) {
        int value = 5;
        int ans = print(value);
        System.out.println(ans);
    }

    private static int print(int value) {
        if (value == 0) return 0;
        return value + print(value - 1);
    }
}
