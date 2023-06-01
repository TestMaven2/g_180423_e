package lesson9.search;

public class SearchUtils {

    public static int linearSearch(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int element) {

        int start = 0;
        int end = array.length - 1;
        int current = array.length / 2;

        while (start <= end) {

            if (array[current] == element) {
                return current;
            } else if (element < array[current]) {
                end = current - 1;
            } else {
                start = current + 1;
            }
            current = (start + end) / 2;
        }
        return -1;
    }

    public static int jumpSearch(int[] array, int element) {

        int start = 0;
        int jump = (int) Math.sqrt(array.length);
        int end = jump;

        while (end < array.length) {

            if (array[end] < element) {
                start = end + 1;
                end = start + jump;
            } else {
                break;
            }
        }

        if (end >= array.length) {
            end = array.length - 1;
        }

        for (int i = start; i <= end; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}