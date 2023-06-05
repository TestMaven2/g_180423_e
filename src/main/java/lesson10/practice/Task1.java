package lesson10.practice;

public class Task1 {

    public static String concatReversStr(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        return result.append(str1).append(str2).reverse().toString();
    }

    public static void main(String[] args) {

        //напишите метод, который принимает две строки в аргументах,
        // соединяет их и определяет реверсивный порядок, выведите результат на консоль.
        String str1 = "Hello1";
        String str2 = "hello2";
        System.out.println(concatReversStr(str1, str2));
    }
}
