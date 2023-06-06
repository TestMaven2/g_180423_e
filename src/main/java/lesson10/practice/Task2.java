package lesson10.practice;

public class Task2 {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        System.out.println(getCorrectValue(arr));
    }

    public static String getCorrectValue(char[] array) {

        StringBuilder builder = new StringBuilder();
        builder.append(array);
        int index = builder.indexOf("?");
        builder.replace(index, index + 1, "e");
        return builder.toString();
    }
}