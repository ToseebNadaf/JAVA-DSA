package Array;

public class Longest_subarray_with_given_sumK {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,1,1};
        int sumValue = 3;
        int value = longSubarray(array,sumValue);
        System.out.print("Longest subarray of length with given sum is: " + value);
    }

    private static int longSubarray(int[] array, int sumValue) {
        int size = array.length;
        int maxLength = 0;

        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum = sum + array[j];
                if (sum == sumValue){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}
