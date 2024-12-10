package lab22.Task2.tests;

import lab22.Task2.RPNCalculator;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RPNTest {
    @Test
    public void testRPN1() {
        try {
            Assert.assertEquals(RPNCalculator.evaluateRPN("1 2 +"), 3.0, 0.1);
        }
        catch (Exception e) {

        }
    }

    @Test
    public void testRPN2() {
        try {
            assertEquals(RPNCalculator.evaluateRPN("1 - 1"), 1, 0.1);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Недостаточно операндов для операции: -");
        }
    }
}
