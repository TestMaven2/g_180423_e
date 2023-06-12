package lesson11.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserUtilsTest {

    private UserUtils.User user;
    private UserUtils utils;

    @BeforeEach
    public void init() {
        utils = new UserUtils();
        user = utils.new User("testLogin", "testPass", 777, "Test");
    }

    @Test
    public void checkDescription() {
        String actual = utils.getDescription(user);
        String expected = "Пользователь: testLogin Test";
        assertEquals(expected, actual);
    }
}