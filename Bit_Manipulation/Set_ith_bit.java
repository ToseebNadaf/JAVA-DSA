package Bit_Manipulation;

public class Set_ith_bit {
    public static void main(String[] args) {
        int value = 9;
        int index = 2;

        value = value | (1 << index );
        System.out.print("Output: " + value);
    }
}
