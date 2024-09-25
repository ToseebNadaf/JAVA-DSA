package Binary_Search;

public class Search_element {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int low = 0;
        int high = array.length - 1;
        int target = 4;
        int result = search(array,low,high,target);

        if (result != -1) {
            System.out.print("Target element found at index: " + result);
        } else {
            System.out.print("Target element not found.");
        }
    }

    private static int search(int[] array, int low, int high, int target) {
        if (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] == target){
                return mid;
            } else if (array[mid] < target) {
                return search(array, mid + 1,high,target);
            }else {
                return search(array,low,mid - 1,target);
            }
        }

        return -1;
    }
}
