package Binary_Search;

public class Find_minimum_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,2,3};
        int value = findMin(array);
        System.out.print("Minimum element is: " + value);
    }

    private static int findMin(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[low] <= array[mid]){
                ans = Math.min(ans, array[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans,array[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}
