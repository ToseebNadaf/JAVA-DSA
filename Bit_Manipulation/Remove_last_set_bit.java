package Bit_Manipulation;

public class Remove_last_set_bit {
    public static void main(String[] args) {
        int value = 13;

        value = value & value - 1;

        System.out.print("Output: " + value);
    }
}
