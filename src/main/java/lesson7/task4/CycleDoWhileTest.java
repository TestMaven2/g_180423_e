package lesson7.task4;

import java.util.Scanner;

public class CycleDoWhileTest {

    public static void main(String[] args) {

        // Пользователь должен выбрать вариант игры - против другого игрока или против компьютера

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Выберите режим игры:");
            System.out.println("1. Друг против друга.");
            System.out.println("2. Против компьютера.");
            System.out.println("3. Двое на двое.");
            System.out.println("4. Двое против компьютера.");

            // Если игрок выбрал неверное значение, например 4,
            // мы должны запустить цикл ещё раз, чтобы пользователь повторил выбор.

            option = scanner.nextInt();
            // option == 1 -> false || true -> true
            // option == 2 -> true || false -> true
            // option == 3 -> true || true -> true

            // option == 1 -> false && true -> false
            // option == 2 -> true && false -> false
            // option == 3 -> true && true -> true
        } while (option < 1 || option > 4);
//        while (option != 1 && option != 2 && option != 3 && option != 4);
    }
}
