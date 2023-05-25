package lesson8.task1;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] intArray = new int[10];
        double[] doubleArray;
        boolean[] booleanArray;

        int[] intArray1 = {7, 2, 8, 9, 2, 5, 7, 1, 0};

        intArray[5] = 15;

        System.out.println(intArray[5]);

        System.out.println(intArray1[3]);

        System.out.println("Вывод всех значений массива с помощью цикла:");

//        System.out.println(intArray1[0]);
//        System.out.println(intArray1[1]);
//        System.out.println(intArray1[2]);

        for (int i = 0; i < intArray1.length; i++) {
            System.out.println(i + 1 + ". " + intArray1[i]);
        }

        System.out.println("Вывод всех значений массива с помощью for-each:");

        for (int value : intArray1) {
            System.out.println(value);
        }

        System.out.println("Вывод всех значений с помощью метода класса Arrays:");
        String arrayString = Arrays.toString(intArray1);
        System.out.println(arrayString);

        System.out.println("Вывод всех значений с конца массива через одну ячейку:");

        for (int i = intArray1.length - 1; i >= 0; i -= 2) {
            System.out.println(intArray1[i]);
        }
    }
}
