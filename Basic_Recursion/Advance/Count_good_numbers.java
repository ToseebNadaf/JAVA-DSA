package Basic_Recursion.Advance;

public class Count_good_numbers {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println("Output: " + goodDigitString(1));
    }

    private static long goodDigitString(long value) {
        if (value == 0) {
            return 1;
        }

        long evenChoices = 5;
        long oddChoices = 4;

        long half = goodDigitString(value / 2);
        long result = (half * half) % MOD;

        if (value % 2 == 1) {
            result = (result * evenChoices) % MOD;
        }

        return result;
    }
}
