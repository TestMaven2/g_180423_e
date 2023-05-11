package lesson5.task5;

public class IfElseTest {

    public static void main(String[] args) {

        System.out.println("Начало программы.");

        int a = 10;
        int b = 15;

        if (a == b) {
            System.out.println("a равно b");
        } else {
            System.out.println("a НЕ равно b");
        }

        System.out.println();
        System.out.println("Упражнение второе.");

        if (a > b) {
            System.out.println("a больше, чем b");
            if (a % 2 == 0) {
                System.out.println("и при этом оно чётное");
            }
        }

        System.out.println("Конец программы.");
    }
}
