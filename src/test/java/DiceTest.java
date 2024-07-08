import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void getMaxRoll() {

    Dice testdice = new Dice(2);
    int expected = 12;
    int actual = testdice.getMaxRoll();
    assertEquals(expected,actual);

    }

    @Test
    public void getMinRoll() {
    Dice testdice = new Dice(2);
    int expected = 2;
    int actual = testdice.getMinRoll();
    assertEquals(expected,actual);
    }

    @Test
    public void tossNumbersSum() {
    Dice testdice = new Dice(2);
    int actual = testdice.tossNumbersSum();
        Assert.assertTrue(actual >= 2 && actual <= 24);
    }
}