package Bit_Manipulation;

public class Clear_ith_bit {
    public static void main(String[] args) {
        int value = 13;
        int index = 2;

        value = value & ~(1 << index);
        System.out.print("Output: " + value);
    }
}
