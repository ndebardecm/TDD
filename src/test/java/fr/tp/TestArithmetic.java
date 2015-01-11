package fr.tp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nico on 11/01/2015.
 */
public class TestArithmetic {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }
}
