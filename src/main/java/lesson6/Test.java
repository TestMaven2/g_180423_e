package lesson6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете язык");

        String input = scanner.nextLine().toLowerCase();
        // RU -> ru
        // Ru -> ru
        // rU -> ru
        // ru -> ru

        switch (input) {
            case "ru":
                System.out.println("Русский язык");
                break;
            case "en":
                System.out.println("Английский");
                break;
            case "ge":
                System.out.println("Немецкий");
                break;
            default:
                System.out.println("Испанский");
                break;
        }
    }
}
