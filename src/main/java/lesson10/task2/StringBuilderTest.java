package lesson10.task2;

public class StringBuilderTest {

    public static void main(String[] args) {

//        StringBuilder builder = new StringBuilder();
//        StringBuilder builder = new StringBuilder(100);
        StringBuilder builder = new StringBuilder("Apple");
        builder.trimToSize();

        System.out.println("Размер хранилища: " + builder.capacity());
        System.out.println("Длина строки: " + builder.length());
        System.out.println("Строка: " + builder);

        builder.append("Pear");
//                .append("Cherry").append("Pear").append("Tomato");

        System.out.println("Размер хранилища: " + builder.capacity());
        System.out.println("Длина строки: " + builder.length());
        System.out.println("Строка: " + builder);

        builder.append("Cherry").append("Banana").append("Tomato");

        System.out.println("Размер хранилища: " + builder.capacity());
        System.out.println("Длина строки: " + builder.length());
        System.out.println("Строка: " + builder);

        // Преобразует число к строке и добавляет в конец строки
        builder.append(24);
        System.out.println("Строка: " + builder);

        // Берёт из таблицы кодировки символ, соответствующий переданному коду
        builder.appendCodePoint(101);
        System.out.println("Строка: " + builder);

        // Получить символ из строки по указанному индексу
        System.out.println(builder.charAt(5));

        // Удаляем подстроку из нашей строки по индексам
        builder.delete(9, 15);
        System.out.println(builder);

        // Удаляем символ по индексу
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);

        // Получение индекса по символу
        System.out.println(builder.indexOf("r"));

        // Вставка подстроки
        builder.insert(5, "Cucumber");
        System.out.println(builder);

        // Замену подстроки
        builder.replace(5, 13, "Watermelon");
        System.out.println(builder);

        // Получение подстроки
        String substring = builder.substring(5);
        System.out.println(substring);

        substring = builder.substring(15, 19);
        System.out.println(substring);

        // Преобразование к типу String
        String result = builder.toString();
        System.out.println(result);

        // Получение обратной последовательности символов (разворот)
        builder.reverse();
        System.out.println(builder);
    }
}
