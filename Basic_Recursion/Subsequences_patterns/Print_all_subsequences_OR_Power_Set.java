package Basic_Recursion.Subsequences_patterns;

public class Print_all_subsequences_OR_Power_Set {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Subsequences of " + input + ":");
        printSubsequence(input);
    }

    private static void printSubsequence(String input) {
        generateSubsequence(input,"",0);
    }

    private static void generateSubsequence(String input, String current, int index) {
        if (index == input.length()){
            System.out.println(current);
            return;
        }

        generateSubsequence(input,current,index + 1);

        generateSubsequence(input, current + input.charAt(index), index + 1);
    }
}
