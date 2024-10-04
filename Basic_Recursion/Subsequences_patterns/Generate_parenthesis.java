package Basic_Recursion.Subsequences_patterns;

import java.util.ArrayList;
import java.util.List;

public class Generate_parenthesis {
    public static void main(String[] args) {
        int input = 3;
        List<String> parenthesisList = parenthesis(input);
        System.out.println(parenthesisList);
    }

    private static List<String> parenthesis(int input) {
        List<String> result = new ArrayList<>();

        generateParenthesis(result, "",0,0,input);
        return result;
    }

    private static void generateParenthesis(List<String> result, String current, int open, int close, int input) {
        if (current.length() == 2 * input){
            result.add(current);
            return;
        }

        if (open < input){
            generateParenthesis(result,current + "(",open + 1,close,input);
        }

        if (close < open){
            generateParenthesis(result,current + ")",open,close + 1, input);
        }
    }
}
