package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Дмитрий Шаталов on 2/15/2015.
 */
public class CheckInputTest {
    private CheckInput ci;

    @Before
    public void setUp() {
        ci = new CheckInput();
    }
    @Test
    public void testIsDouble() {
        Assert.assertEquals(false, ci.isDouble("21"));
        Assert.assertEquals(true, ci.isDouble("21,3"));
        Assert.assertEquals(true, ci.isDouble("21.3"));
    }
}
