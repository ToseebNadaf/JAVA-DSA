package Array;

public class Rotate_left_by_N {
    public static void main(String[] args) {
        int size = 7;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotations = 4;

        rotateArrayToLeft(array, size, rotations);

        System.out.print("After rotating the elements to the left: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rotateArrayToLeft(int[] array, int size, int rotations) {
        rotations = rotations % size;

        reverseArray(array, 0, rotations - 1);
        reverseArray(array, rotations, size - 1);
        reverseArray(array, 0, size - 1);

    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
