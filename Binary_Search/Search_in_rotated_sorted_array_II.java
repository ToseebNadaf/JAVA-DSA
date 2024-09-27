package Binary_Search;

public class Search_in_rotated_sorted_array_II {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2,3};
        int element = 7;
        boolean value = searchElement(array,element);
        if (!value){
            System.out.print("Element Not Found");
        } else {
            System.out.print("Element is present in array");
        }
    }

    private static boolean searchElement(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] == element){
                return true;
            }

            if (array[low] <= array[mid]){
                if (array[low] <= element && element < array[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (array[mid] < element && element <= array[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
