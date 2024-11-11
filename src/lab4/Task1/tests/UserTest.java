package lab4.Task1.tests;

import lab4.Task1.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void printUser(){

    }

    @Test
    public void addToCart() {
    }

    @Test
    public void removeFromCart() {
    }

    @Test
    public void getCart() {
    }

    @Test
    public void testToString() {
        User user = new User("John", "123456");

        String result = user.toString();
        String expected = "User[name=John, password=123456]";

        assertEquals(expected, result);
    }
}
