package com.training.java;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий Шаталов on 2/22/2015.
 */
public class TestDriveTest {

    @Test
    public void testIsStringNumeric() {
        Assert.assertEquals(false, TestDrive.isStringNumeric("as"));
        Assert.assertEquals(true, TestDrive.isStringNumeric("12"));
        Assert.assertEquals(true, TestDrive.isStringNumeric("12,0"));
        Assert.assertEquals(true, TestDrive.isStringNumeric("12.0"));
    }

    @Test
    public void testCompute() {
        Assert.assertEquals(5, TestDrive.compute(new CalculatorInt(1, 5), 0));
        Assert.assertEquals(6, TestDrive.compute(new CalculatorInt(1, 5), 2));
        Assert.assertEquals(6.0, TestDrive.compute(new CalculatorDouble(0.5, 5.5), 2));
    }
}
