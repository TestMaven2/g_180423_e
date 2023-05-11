package lesson5.task3;

public class BooleanTest {

    public static void main(String[] args) {

        boolean a1 = true;
        boolean a2 = false;
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("true && false");
        System.out.println(a1 && b2);

        System.out.println("true && true");
        System.out.println(a1 && b1);

        System.out.println("false && false");
        System.out.println(a2 && b2);

        System.out.println();

        System.out.println("true || true");
        System.out.println(a1 || b1);

        System.out.println("true || false");
        System.out.println(a1 || b2);

        System.out.println("false || false");
        System.out.println(a2 || b2);

        // x >= 1 && x <= 10 && y >= 1 && y <= 10
    }
}
