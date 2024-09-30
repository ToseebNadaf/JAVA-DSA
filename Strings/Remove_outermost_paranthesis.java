package Strings;

public class Remove_outermost_paranthesis {
    public static void main(String[] args) {
        String value = "(()())(())";
        System.out.print("New String: " + result(value));
    }

    private static String result(String input) {
        StringBuilder result = new StringBuilder();

        int bracketCount = 0;

        for (char ch : input.toCharArray()){
            if (ch == '('){
                if (bracketCount > 0){
                    result.append(ch);
                }

                bracketCount++;
            }

            else {
                bracketCount--;
                if (bracketCount > 0){
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
