package Basic_Recursion;

public class Print_name_N_times {
    static int value = 0;

    public static void main(String[] args) {
        print();
    }

    private static void print() {
        if (value == 4) return;

        System.out.println("Mahesh");

        value = value + 1;

        print();
    }
}
