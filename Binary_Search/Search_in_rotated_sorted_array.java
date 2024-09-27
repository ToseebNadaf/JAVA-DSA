package Binary_Search;

public class Search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2,3};
        int element = 6;
        int value = searchElement(array,element);
        System.out.print("Index of an element is: " + value);
    }

    private static int searchElement(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] == element){
                return mid;
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

        return -1;
    }
}
