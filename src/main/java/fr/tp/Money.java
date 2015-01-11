package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public abstract class Money {

    protected int amount;

    static Money dollar(int amount){
        return new Dollar(amount);
    }

    static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return money.amount == this.amount && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);
}
