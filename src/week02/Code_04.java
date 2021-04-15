package src.week02;

public class Code_04 {
    public static void main(String[] args) {
        float float_val = 1.6f;
        long long_val = (long) float_val;
        float float_val2 = long_val;

        System.out.println("float_val = " + float_val);
        System.out.println("long_val = " + long_val);
        System.out.println("float_val2 = " + float_val2);

        long long_val2 = 2_247_483_648L;
        float float_val3 = long_val2;
        System.out.println("long_val2 = " + long_val2);
        System.out.println("float_val3 = " + float_val3);
    }
}
