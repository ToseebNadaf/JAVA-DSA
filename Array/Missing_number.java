package Array;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5};
        int N = 5;
        int result = missing(arr,N);
        System.out.print("Missing No: " + result);
    }

    private static int missing(int[] arr, int N) {
        int expectedSum = (N * (N + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            sum = sum + arr[i];
        }

        int missingValue = expectedSum - sum;

        return missingValue;
    }
}
