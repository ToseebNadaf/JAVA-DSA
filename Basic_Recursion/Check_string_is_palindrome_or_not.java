package Basic_Recursion;

public class Check_string_is_palindrome_or_not {
    public static void main(String[] args) {
        String value = "ABA";
        boolean ans = palindrome(0,value);
        System.out.println(ans);
    }

    private static boolean palindrome(int i, String value) {
        if (i >= value.length() / 2) return true;

        if (value.charAt(i) != value.charAt(value.length() - i - 1)) return false;

        return palindrome(i + 1, value);
    }
}
