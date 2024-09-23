package Array;

public class Linear_search {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int size = 5;
        int elementToFound = 4;

        int result = search(array,size,elementToFound);

        if (result != -1){
            System.out.print("Element found at index " + result);
        } else {
            System.out.print("Element not found");
        }
    }

    private static int search(int[] array, int size, int elementToFound) {
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToFound) {
                return i;
            }
        }

        return -1;
    }
}
