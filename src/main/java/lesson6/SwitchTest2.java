package lesson6;

public class SwitchTest2 {

    public static void main(String[] args) {

        int i = 1;
        String word = "Hello";
        String forCase = "World";

        switch (word) {
            case "Hello":
                System.out.println("Это слово Hello");
                break;
            case "Java":
                System.out.println("Это слово Java");
                break;
            default:
                System.out.println("Это какое-то другое слово");
                break;
        }
    }
}
