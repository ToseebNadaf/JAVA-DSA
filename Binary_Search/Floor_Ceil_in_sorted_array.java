package Binary_Search;

import java.util.Arrays;

public class Floor_Ceil_in_sorted_array {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,};
        int element = 4;
        int size = array.length;
        int[] answer = floorAndCeil(array,element,size);
        System.out.print("Floor and Ceil of element is: " + Arrays.toString(answer));
    }

    private static int[] floorAndCeil(int[] array, int element, int size) {
        int floorValue = floor(array,element,size);
        int ceilValue = ceil(array,element,size);

        return new int[] {floorValue, ceilValue};
    }

    private static int ceil(int[] array, int element, int size) {
        int low = 0;
        int high = size - 1;
        int ans = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] >= element){
                ans = array[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static int floor(int[] array, int element, int size) {
        int low = 0;
        int high = size - 1;
        int ans = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] <= element){
                ans = array[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }


}
