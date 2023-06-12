package lesson12.task1;

public class Utils {

    public static int calculate(int a, int b, int c, int d) {
        // Посчитать и вернуть результат выражения (a + b - c) / d
        // Дополнительно вывести в консоль числитель
        // Если знаменатель равен 0, то вывести предупреждение и
        // занести в знаменатель значение 1

        int numerator = a + b - c;
        System.out.println("Числитель равен " + numerator);

        if (d == 0) {
            System.out.println("Аргумент d не может равняться нулю.");
            d = 1;
        }

        int result = numerator / d;
        return result;
    }

    public static int[] getArrayBySize(int size) {
        // Метод должен вернуть массив размером size,
        // заполненный элементами от 1 до size

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = i + 1;
        }

        return result;
    }
}