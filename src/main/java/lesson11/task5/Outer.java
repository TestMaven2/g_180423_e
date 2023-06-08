package lesson11.task5;

public class Outer {

    public static void print() {
        System.out.println("Outer class");
    }

    static class Inner {
        public static void print() {
            System.out.println("Inner class");
        }
    }
}