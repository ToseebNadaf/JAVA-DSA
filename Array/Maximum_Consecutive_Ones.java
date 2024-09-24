package Array;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,0,0,1,1,1};
        int value = maxConsecutive(array);
        System.out.print("Maximum Consecutive 1's is: " + value);
    }

    private static int maxConsecutive(int[] array) {
        int currentCount = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                currentCount++;
            } else {
                currentCount = 0;
            }
        }

        maxCount = Math.max(currentCount,maxCount);
        return maxCount;
    }
}
