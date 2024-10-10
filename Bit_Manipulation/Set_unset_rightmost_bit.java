package Bit_Manipulation;

public class Set_unset_rightmost_bit {
    public static void main(String[] args) {
        int value = 12;
        int result = value & (value - 1);
        System.out.println(result);
    }
}
