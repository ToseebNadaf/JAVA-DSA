package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighLow_frequency_of_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        elementHighLowFreq(array);
    }

    private static void elementHighLowFreq(int[] array) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int element : array){
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        int elementWithHighFreq = -1;
        int elementWithLowFreq = -1;

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > highestFreq){
                highestFreq = frequency;
                elementWithHighFreq = element;
            }

            if (frequency < lowestFreq){
                lowestFreq = frequency;
                elementWithLowFreq = element;
            }
        }

        System.out.println("Element with the highest frequency: " + elementWithHighFreq + " (Frequency: " + highestFreq + ")");
        System.out.println("Element with the lowest frequency: " + elementWithLowFreq + " (Frequency: " + lowestFreq + ")");
    }
}
