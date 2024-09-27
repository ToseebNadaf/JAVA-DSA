package Binary_Search;

public class Search_insert_position {
    public static void main(String[] args) {
        int[] array = {1,2,4,5};
        int element = 3;
        int value = insertPosition(array,element);
        System.out.print("Element inserted at index: " + value);
    }

    private static int insertPosition(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        int ans = 0;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] >= element){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
