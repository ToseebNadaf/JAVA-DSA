package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_frequencies_of_array_elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int value = input.nextInt();

        int[] array = new int[value];

        for (int i = 0; i < value; i++) {
            array[i] = input.nextInt();
        }

        countFrequency(array);
    }

    public static void countFrequency(int[] array) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int element: array){
            if (freqMap.containsKey(element)){
                freqMap.put(element, freqMap.get(element) + 1);
            } else {
                freqMap.put(element, 1);
            }
        }

        System.out.println("Frequency of Element: ");
        for (HashMap.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " -> Frequency: " + entry.getValue());
        }
    }
}
