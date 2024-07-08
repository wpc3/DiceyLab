import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void createBin() {
    Bins bin = new Bins(2,12);
    bin.createBin();
    boolean actual = (bin.binMap.size() == 11);
        Assert.assertTrue(actual);
    }

    @Test
    public void incrementBin() {
    Bins bin = new Bins(2,12);
    bin.createBin();
    bin.incrementBin(4);
    bin.incrementBin(4);
    boolean actual = ((bin.binMap.get(4)) ==2);
    Assert.assertTrue(actual);
    }

    @Test
    public void getBin() {
    Bins bin = new Bins(2,12);
    bin.createBin();

    bin.incrementBin(12);
    bin.incrementBin(12);
    boolean actual = (bin.getBin(12)==2);
    Assert.assertTrue(actual);
    }
}