package Array;

import java.util.HashMap;
import java.util.Map;

public class Find_the_number_appears_once {
    public static void main(String[] args) {
        int[] array = new int[]{4,3,1,3,1};
        int size = array.length;
        int value = find(array,size);
        System.out.print("Number appear ones is: " + value);
    }

    private static int find(int[] array, int size) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int count = freq.getOrDefault(array[i], 0);
            freq.put(array[i], count + 1);
        }

        for (Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }
}
