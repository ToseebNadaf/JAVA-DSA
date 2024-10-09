package Basic_Recursion.Subsequences_patterns;

public class Count_subsequence_with_sum_K {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int K = 3;
        int n = arr.length;

        System.out.println("Total subsequences with sum " + K + ": " + countSubsequences(arr, n, 0, K));
    }

    private static int countSubsequences(int[] arr, int n, int sum, int k) {
        if (n == 0) {
            return (sum == k) ? 1 : 0;
        }

        int exclude = countSubsequences(arr, n - 1, sum, k);

        int include = countSubsequences(arr, n - 1, sum + arr[n - 1], k);

        return exclude + include;
    }
}
