package Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_single_element_in_sorted_array {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int value = searchElement(array);
        System.out.print("Single Element is: " + value);
    }

    private static int searchElement(ArrayList<Integer> array) {
        int n = array.size();

        if (n == 1) return array.get(0);
        if (!array.get(0).equals(array.get(1))) return array.get(0);
        if (!array.get(n - 1).equals(array.get(n - 2))) return array.get(n - 1);

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (!array.get(mid).equals(array.get(mid + 1)) && !array.get(mid).equals(array.get(mid - 1))) {
                return array.get(mid);
            }

            if ((mid % 2 == 1 && array.get(mid).equals(array.get(mid - 1))) ||
                    (mid % 2 == 0 && array.get(mid).equals(array.get(mid + 1)))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
