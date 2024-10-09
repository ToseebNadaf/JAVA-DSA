package Bit_Manipulation;

public class Check_for_ith_bit_present_or_not {
    public static void main(String[] args) {
        int input  = 13;
        int index = 2;
        boolean result = bitCheck(input,index);
        System.out.print("Output: " + result);
    }

    private static boolean bitCheck(int input, int index) {
        if ((input & (1 << index)) != 0){
            return true;
        } else {
            return false;
        }
    }
}
