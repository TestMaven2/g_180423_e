package lesson7.task2;

public class CycleTest {

    public static void main(String[] args) {

        // Вывести в консоль сумму всех чисел от 1 до 20

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма: " + sum);

        // Вывести в консоль сумму всех кратных трём чисел от 1 до 20

        sum = 0;
        for (int i = 1; i <= 20; i++) {
            // sum = 3 + 6 + 9 + ... + 18
            if (i % 3 == 0) {
                sum += i; // краткая запись выражения sum = sum + i;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
