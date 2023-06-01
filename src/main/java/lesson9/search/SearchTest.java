package lesson9.search;

import lesson9.sort.SortUtils;

import java.util.Arrays;

public class SearchTest {

    public static void main(String[] args) {

        int[] array = {3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2, 50};

        System.out.print("Результат линейного поиска: ");
        System.out.println(SearchUtils.linearSearch(array, 50));

        Arrays.sort(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));

        System.out.print("Результат двоичного поиска: ");
        System.out.println(SearchUtils.binarySearch(array, 14));

        System.out.print("Результат поиска прыжками: ");
        System.out.println(SearchUtils.jumpSearch(array, 14));

        array = new int[]{3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2, 50};

        System.out.println("Исходный неотсортированный массив:");
        System.out.println(Arrays.toString(array));

        SortUtils.bubbleSort(array);
        System.out.println("Сортировка методом пузырька:");
        System.out.println(Arrays.toString(array));

        array = new int[]{3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2, 50};

        System.out.println("Исходный неотсортированный массив:");
        System.out.println(Arrays.toString(array));

        SortUtils.insertionSort(array);
        System.out.println("Сортировка вставками:");
        System.out.println(Arrays.toString(array));

        array = new int[]{3, 7, 1, 3, 9, 2, 14, 78, 16, 12, 0, 7, 2, 50};

        System.out.println("Исходный неотсортированный массив:");
        System.out.println(Arrays.toString(array));

        SortUtils.selectionSort(array);
        System.out.println("Сортировка выбором:");
        System.out.println(Arrays.toString(array));
    }
}
