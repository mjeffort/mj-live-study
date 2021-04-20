package src.week02;

import static java.lang.Math.pow;

public class Code_07 {
    public static void main(String[] args) {
        float val_01 = 3.4028235F;
        float val_02 = -3.4028235F;
        float val_03 = 1.4F;
        float val_04 = -1.4F;
        val_01 *= pow(10, 38);
        val_02 *= pow(10, 38);
        val_03 *= pow(10, -45);
        val_04 *= pow(10, -45);

        System.out.println("val_01 = " + val_01);
        System.out.println("val_02 = " + val_02);
        System.out.println("val_03 = " + val_03);
        System.out.println("val_04 = " + val_04);

    }
}
