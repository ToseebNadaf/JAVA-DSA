package Basic_Recursion.Advance;

public class Pow_xn {
    public static void main(String[] args) {
        double input = 2.0000;
        int power = 10;
        double result = myPow(input,power);
        System.out.print("Output: " + result);
    }

    private static double myPow(double input, int power) {
        if (power == 0){
            return 1;
        }

        if (power <= 0){
            return myPow(input, -power);
        }

        double half = myPow(input, power / 2);
        if (power % 2 == 0){
            return half * half;
        } else {
            return input * half * half;
        }
    }
}
