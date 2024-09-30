package Strings;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String[] array = {"flower","flow","flight"};
        String result = longPrefix(array);
        System.out.print("Longest prefix is: " + result);
    }

    private static String longPrefix(String[] array) {
        if (array == null || array.length == 0) {
            return "";
        }

        String prefix = array[0];

        for (int i = 1; i < array.length; i++) {
            while (array[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
}
