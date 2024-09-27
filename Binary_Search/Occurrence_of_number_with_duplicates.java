package Binary_Search;

public class Occurrence_of_number_with_duplicates {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3, 4, 5};
        int element = 2;
        int count = countOccurrences(array, element);
        System.out.println("Occurrence of element " + element + " is: " + count);
    }

    private static int countOccurrences(int[] array, int element) {
        int firstOccurrence = findFirstOccurrence(array, element);
        if (firstOccurrence == -1) {
            return 0;
        }
        int lastOccurrence = findLastOccurrence(array, element);
        return lastOccurrence - firstOccurrence + 1;
    }

    private static int findFirstOccurrence(int[] array, int element) {
        int low = 0, high = array.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == element) {
                result = mid;
                high = mid - 1;
            } else if (array[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private static int findLastOccurrence(int[] array, int element) {
        int low = 0, high = array.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == element) {
                result = mid;
                low = mid + 1;
            } else if (array[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
