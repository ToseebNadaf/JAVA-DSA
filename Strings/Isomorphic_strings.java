package Strings;

public class Isomorphic_strings {
    public static void main(String[] args) {
        String input1 = "foo";
        String input2 = "bar";
        boolean result = isomorphic(input1,input2);
        System.out.print("Strings are isomorphic: " + result);
    }

    private static boolean isomorphic(String input1, String input2) {
        if (input1.length() != input2.length()){
            return false;
        }

        int[] array1 = new int[256];
        int[] array2 = new int[256];

        for (int i = 0; i < input1.length(); i++) {
            char char1 = input1.charAt(i);
            char char2 = input2.charAt(i);

            if (array1[char1] != array2[char2]){
                return false;
            }

            array1[char1] = i + 1;
            array2[char2] = i + 1;
        }

        return true;
    }
}
