package lesson10.task1;

public class StringTest {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 3;
        Cat cat2 = new Cat();
        cat2.age = 3;

        System.out.println(cat1 == cat2);

        String word1 = "Hello";
        String word2 = "Hello";

        System.out.println(word1 == word2);

        // Сравнение по значениям
        System.out.println(word1.equals(word2));

        word2 = word2 + "!!!";

        System.out.println(word1);
        System.out.println(word2);
    }
}
