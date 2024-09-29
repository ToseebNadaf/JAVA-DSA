package Binary_Search;

public class Search_single_element_in_sorted_array {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,4,5,5};
        int value = searchElement(array);
        System.out.print("Single Element is: " + value);
    }

    private static int searchElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                if (array[i] != array[i + 1]){
                    return array[i];
                }
            } else if (i == array.length - 1) {
                if (array[i] != array[i - 1]){
                    return array[i];
                }
            } else {
                if (array[i] != array[i + 1] && array[i] != array[i - 1]){
                    return array[i];
                }
            }
        }

        return -1;
    }
}
