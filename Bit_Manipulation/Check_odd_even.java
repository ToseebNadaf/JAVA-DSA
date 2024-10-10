package Bit_Manipulation;

public class Check_odd_even {
    public static void main(String[] args) {
        int value = 12;
        if ((value & 1) == 0){
            System.out.print(value + " is even number");
        } else {
            System.out.print(value + " is odd number");
        }
    }
}
