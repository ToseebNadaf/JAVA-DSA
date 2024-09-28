package Binary_Search;

public class How_many_times_array_rotated {
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2,3};
        int value = rotationTime(array);
        System.out.print("Array is rotated " + value + " times");
    }

    private static int rotationTime(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int minValue = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[low] <= array[high]) {
                if (array[low] < minValue) {
                    minValue = array[low];
                    index = low;
                }
                break;
            }

            if (array[low] <= array[mid]){
                if (array[low] < minValue){
                    minValue = array[low];
                    index = low;
                }

                low = mid + 1;
            } else {
                if (array[mid] < minValue){
                    minValue = array[mid];
                    index = mid;
                }

                high = mid - 1;
            }
        }

        return index;
    }
}
