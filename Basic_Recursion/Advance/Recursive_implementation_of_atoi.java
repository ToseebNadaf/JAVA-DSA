package Basic_Recursion.Advance;

public class Recursive_implementation_of_atoi {
    static final int INT_MAX = 2147483647;
    static final int INT_MIN = -2147483648;

    public static int myAtoi(String value) {
        value = value.trim();
        if (value.isEmpty()) return 0;

        int sign = 1;
        int index = 0;
        int length = value.length();

        if (value.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (value.charAt(index) == '+') {
            index++;
        }

        return myAtoiRecursive(value, index, sign, 0);
    }

    private static int myAtoiRecursive(String value, int i, int sign, int result) {
        if (i >= value.length() || !Character.isDigit(value.charAt(i))) {
            return result * sign;
        }

        int digit = value.charAt(i) - '0';

        if (result > (INT_MAX - digit) / 10) {
            return sign == 1 ? INT_MAX : INT_MIN;
        }

        result = result * 10 + digit;

        return myAtoiRecursive(value, i + 1, sign, result);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
    }
}
