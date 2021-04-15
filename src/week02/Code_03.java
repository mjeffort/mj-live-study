package src.week02;

public class Code_03 {
    int x, y;           // x, y;    Instance Variable
    static int result;  // result;  Class Variable

    void add(int a, int b) {    // a, b ; Local Variables
        x = a;
        y = b;
        int sum = x + y;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Code_03 obj = new Code_03();
        obj.add(10, 20);
    }
}
