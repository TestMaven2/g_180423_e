package lesson2;

public class Tiger {

    public int weight;
    public static int legsCount = 4;

    public void sleep() {
        System.out.println("Тигр спит.");
        weight = weight - 1;
    }

    public static void printInfo() {
        System.out.println("Это класс Tiger");
    }
}