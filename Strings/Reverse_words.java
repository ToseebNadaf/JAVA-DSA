package Strings;

public class Reverse_words {
    public static void main(String[] args) {
        String input = "the sky is blue";
        String result = reverseString(input);
        System.out.print("Reverse String: " + result);
    }

    private static String reverseString(String input) {
        StringBuilder finalValue = new StringBuilder();

        int length = input.length();
        int i = length - 1;

        while (i >= 0){
            while (i >= 0 && input.charAt(i) == ' '){
                i--;
            }

            int j = i;
            if (i < 0){
                break;
            }

            while (i >= 0 && input.charAt(i) != ' ') {
                i--;
            }

            finalValue.append(input, i + 1, j + 1).append(' ');

        }

        return finalValue.toString().trim();
    }
}
