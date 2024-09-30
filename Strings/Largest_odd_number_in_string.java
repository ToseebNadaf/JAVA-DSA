package Strings;

public class Largest_odd_number_in_string {
    public static void main(String[] args) {
        String input = "12342";
        String result = largeOddNum(input);
        System.out.print("Largest Odd Number: " + result);
    }

    private static String largeOddNum(String input) {
        int length = input.length();

        for (int i = length - 1; i >= 0; i--) {
            if (isOdd(input.charAt(i))){
                return input.substring(0, i + 1);
            }
        }

        return "";
    }

    private static boolean isOdd(char c) {
        return c == '1' || c == '3' || c == '5' || c == '7' || c == '9';
    }
}
