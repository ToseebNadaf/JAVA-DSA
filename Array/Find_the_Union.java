package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_the_Union {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 3, 4, 5, 6, 7};
        int size1 = arr1.length;
        int size2 = arr2.length;

        ArrayList<Integer> union = unionArray(arr1, arr2, size1, size2);
        System.out.println(union);
    }

    private static ArrayList<Integer> unionArray(int[] arr1, int[] arr2, int size1, int size2) {
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.getLast() != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < size1) {
            if (union.isEmpty() || union.getLast() != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < size2) {
            if (union.isEmpty() || union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
