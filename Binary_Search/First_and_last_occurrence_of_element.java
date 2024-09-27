package Binary_Search;

public class First_and_last_occurrence_of_element {
    public static void main(String[] args) {
        int[] array = {1,2,3,8,8,8,6};
        int element = 8;
        int value = occurrence(array,element);
        System.out.print("Last element occur at index: " + value);
    }

    private static int occurrence(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        int ans = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] >= element) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
