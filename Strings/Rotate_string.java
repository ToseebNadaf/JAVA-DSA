package Strings;

public class Rotate_string {
    public static void main(String[] args) {
        String input1 = "abcde";
        String input2 = "cdeab";
        boolean result = rotateString(input1,input2);
        System.out.print("Is it rotated string: " + result);
    }

    private static boolean rotateString(String input1, String input2) {
        if (input1.length() != input2.length()){
            return false;
        }

        String doubleInput = input1 + input1;

        return doubleInput.contains(input2);
    }
}
