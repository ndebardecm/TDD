package fr.tp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 11/01/2015.
 */
public class TestArithmetic {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
