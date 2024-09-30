package Strings;

public class Valid_anagram {
    public static void main(String[] args) {
        String input1 = "anagram";
        String input2 = "nagaram";
        boolean result = isAnagram(input1,input2);
        System.out.print("Given Strings are valid anagram: " + result);
    }

    private static boolean isAnagram(String input1, String input2) {
        if (input1.length() != input2.length()){
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < input1.length(); i++) {
            count[input1.charAt(i) - 'a']++;
            count[input2.charAt(i) - 'a']--;
        }

        for (int c : count){
            if (c != 0){
                return false;
            }
        }

        return true;
    }
}
