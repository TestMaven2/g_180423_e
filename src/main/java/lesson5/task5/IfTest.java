package lesson5.task5;

public class IfTest {

    public static void main(String[] args) {

        System.out.println("Начало работы программы.");

        int a = 3;
        int b = 7;
        boolean result = a < b;

        if (result) {
            System.out.println("a меньше, чем b. Слоны идут на север");
        }

        System.out.println("Конец работы программы.");

        // true == true - true
        // false == true - false
    }
}
