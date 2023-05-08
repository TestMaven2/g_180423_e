package lesson4.task2;

public class MethodTest {

    public static void main(String[] args) {

        System.out.println("Начало работы программы");
        System.out.println("Вызываем метод");
        int result = sumTwoNumbers(7, 2);
        System.out.println("Результат работы метода: " + result);
        System.out.println("Конец работы программы");

        System.out.println(joinStrings("Hello, ", "World!"));
    }

    public static String joinStrings(String first, String second) {
//        String result = first + second;
//        return result;

        return first + second;
    }

    public static int sumTwoNumbers(int first, int second) {
        System.out.println("Начал работу метод");
        int sum = first + second;
        System.out.println("Метод закончил работу");
        return sum;
    }
}