package Bit_Manipulation;

public class Check_number_is_power_of_two {
    public static void main(String[] args) {
        int value = 30;
        boolean result;

        if ((value & (value - 1)) == 0){
            result = true;
        } else {
            result = false;
        }

        System.out.print("Output: " + result);
    }
}
