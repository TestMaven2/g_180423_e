package lesson8.task3;

import java.util.Arrays;

public class ArrayMethodsTest {

    public static void main(String[] args) {

        int[] source = {7, 5, 3, 8, 4, 6, 2, 1, 1};

        int[] target = source.clone();

        System.out.println(Arrays.toString(target));

        int[] array = Arrays.copyOf(source, 5);

        System.out.println(Arrays.toString(array));

        int[] array1 = Arrays.copyOfRange(source, 2, 6);

        System.out.println(Arrays.toString(array1));

        Arrays.sort(source);

        System.out.println(Arrays.toString(source));
    }
}
