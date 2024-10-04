package Basic_Recursion.Subsequences_patterns;

public class Generate_all_binary_strings {
    public static void main(String[] args) {
        int input = 3;
        binaryValues(input);
    }

    private static void binaryValues(int input) {
        char[] chars = new char[input];
        generateBinary(chars, 0, input);
    }

    private static void generateBinary(char[] chars, int index, int input) {
        if (index == input){
            System.out.println(new String(chars));
            return;
        }

        chars[index] = '0';
        generateBinary(chars,index + 1, input);

        chars[index] = '1';
        generateBinary(chars,index + 1, input);
    }
}
