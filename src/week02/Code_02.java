package src.week02;

public class Code_02 {
    public static void main(String[] args) {
        System.out.println("==정수 리터럴==");
        int value1 = 0b100;
        int value2 = 023;
        int value3 = 8;
        int value4 = 0x10;
        long value5 = 10L;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
//        System.out.println(value6);

        System.out.println("==실수 리터럴==");
        float val1 = 1.234F;
        float val2 = (float) 1.234D;
        double val3 = 1.234;
        double val4 = 1.23;
        double val5 = 1.235d;
        double val6 = 1234E-3d;

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
    }

}
