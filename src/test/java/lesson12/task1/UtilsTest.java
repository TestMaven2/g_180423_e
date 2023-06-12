package lesson12.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UtilsTest {

    private int[] result;

    @BeforeEach
    public void init() {
        result = Utils.getArrayBySize(7);
    }

    @Test
    public void checkCalculatedValue() {
        int actual = Utils.calculate(10, 7, 2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    // 1. Проверить длину массива
    // 2. Проверить, не null ли возвращает метод
    // 3. Проверить значения внутри массива

    @Test
    public void checkArrayLength() {
//        int[] result = Utils.getArrayBySize(7);
        int actual = result.length;
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void isArrayNotNull() {
//        int[] result = Utils.getArrayBySize(3);
        assertNotNull(result);
    }

    @Test
    public void checkArrayValue() {
//        int[] result = Utils.getArrayBySize(4);
        int actual = result[2];
        int expected = 3;
        assertEquals(expected, actual);
    }
}