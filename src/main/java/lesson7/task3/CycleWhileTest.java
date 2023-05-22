package lesson7.task3;

import java.util.Scanner;

public class CycleWhileTest {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("Пожалуйста, придумайте логин длиной не менее 6 символов");
        String login = "";
        Scanner scanner = new Scanner(System.in);

        while (login.length() < 6) {
            login = scanner.nextLine();
        }

        System.out.println("Вы выбрали логин: " + login);

        for (int j = 0; j < -5; j++) {
            System.out.println("Этот цикл не отработает");
        }

        int a = 5;
        int b = 10;

        while (b < a) {
            System.out.println("И этот цикл не отработает");
        }
    }
}