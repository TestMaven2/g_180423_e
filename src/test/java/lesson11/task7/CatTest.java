package lesson11.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    private Cat cat;

    @BeforeEach
    public void init() {
        cat = new Cat();
    }

    @Test
    public void isCatHungry() {
        boolean actual = cat.feedCat(9);
        assertFalse(actual);
    }

    @Test
    public void isCatFull() {
        boolean actual = cat.feedCat(10);
        assertTrue(actual);
    }
}