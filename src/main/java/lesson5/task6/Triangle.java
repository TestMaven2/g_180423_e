package lesson5.task6;

public class Triangle {

    public static void main(String[] args) {

        // Даны три стороны треугольника.
        // Определить, какой это треугольник:
        // равносторонний, равнобедренный или разносторонний.

        int a = 8;
        int b = 5;
        int c = 8;

        if (a != b && b != c && a != c) {
            System.out.println("Разносторонний.");
        } else if (a == b && a == c) {
            System.out.println("Равносторонний.");
        } else {
            System.out.println("Равнобедренный.");
        }
    }
}
