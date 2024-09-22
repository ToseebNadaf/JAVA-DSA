package Basic_Recursion;

public class Print_1_to_N {
    public static void main(String[] args) {
        int value = 4;
        print(1,value);
    }

    private static void print(int i, int value) {
        if (i > value) return;

        System.out.println(i);

        i = i + 1;

        print(i,value);
    }
}
