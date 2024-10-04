package Basic_Recursion.Subsequences_patterns;

import java.util.ArrayList;
import java.util.List;

public class Subsequences_of_number {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println("Subsequences of the array:");
        subsequence(array);
    }

    private static void subsequence(int[] array) {
        List<Integer> current = new ArrayList<>();
        generateSubsequence(array, current,0);
    }

    private static void generateSubsequence(int[] array, List<Integer> current, int index) {
        if (index == array.length){
            System.out.println(current);
            return;
        }

        generateSubsequence(array, current, index + 1);

        current.add(array[index]);
        generateSubsequence(array, current, index + 1);

        current.removeLast();
    }
}
