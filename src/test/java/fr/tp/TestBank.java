package fr.tp;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by nico on 12/01/2015.
 */
public class TestBank {

    @Test
    public void TestReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        Assert.assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        Assert.assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testIdentityRate() {
        Assert.assertEquals(1, new Bank().rate("USD", "USD"));
    }
}
