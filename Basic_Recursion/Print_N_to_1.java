package Basic_Recursion;

public class Print_N_to_1 {
    public static void main(String[] args) {
        int value = 4;
        print(value,1);
    }

    private static void print(int value, int i) {
        if (value < 1) return;

        System.out.println(value);

        value = value - 1;

        print(value, i);
    }
}
