package Binary_Search;

public class Lower_bound {
    public static void main(String[] args) {
        int[] array = {1,4,5,6,7,7,7,7,8};
        int target = 7;
        int low = 0;
        int ans = -1;
        int high = array.length - 1;

        int result = lowerBound(array,target,low,high,ans);
        if (result != -1) {
            System.out.println("Lower Bound is at index: " + result);
        } else {
            System.out.println("Lower Bound not found.");
        }
    }

    private static int lowerBound(int[] array, int target, int low, int high, int ans) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
