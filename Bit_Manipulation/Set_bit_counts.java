package Bit_Manipulation;

public class Set_bit_counts {
    public static void main(String[] args) {
        int value = 13;
        int result = count(value);
        System.out.print("Output: " + result);
    }

    private static int count(int value) {
        int count = 0;
        while (value > 0){
            if ((value & 1) == 1){
                count++;
            }
            value = value >> 1;
        }

        return count;
    }
}
