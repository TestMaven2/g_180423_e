package lesson6;

public class TernaryTest {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        boolean exp = false;

        int c;

//        if (exp) {
//            c = a;
//        } else {
//            c = b;
//        }

        c = exp ? a : b;

        System.out.println("Результат - " + c);
    }
}
