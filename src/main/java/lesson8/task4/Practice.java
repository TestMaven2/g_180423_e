package lesson8.task4;

import java.util.Arrays;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {

//        Создайте массив из всех нечётных чисел от 1 до 99,
//        выведите его на экран в строку в обратном порядке
        printOddsInReverseOrder();
        System.out.println();

//        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//        Подсчитайте сколько в массиве чётных элементов и выведите это
//        количество на экран на отдельной строке.
        int[] randomArray = createRandomArray();
        System.out.println(Arrays.toString(randomArray));
        System.out.println(calculateAmountOfEvens(randomArray));

    }

    public static int calculateAmountOfEvens(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int[] createRandomArray() {
        Random random = new Random();
        int[] result = new int[15];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(10);
        }
        return result;
    }

    public static void printOddsInReverseOrder() {

        int size = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                size++;
            }
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
