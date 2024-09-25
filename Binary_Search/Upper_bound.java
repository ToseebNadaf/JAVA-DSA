package Binary_Search;

public class Upper_bound {
    public static void main(String[] args) {
        int[] array = {1,2,3,7,7,7,8,9};
        int ans = 0;
        int target = 7;

        int result = upperBound(array,target,ans);
        if (result != -1){
            System.out.print("Target element found at index: " + result);
        } else {
            System.out.print("Target element not found.");
        }
    }

    private static int upperBound(int[] array, int target, int ans) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
