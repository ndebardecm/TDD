package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return money.amount == this.amount;
    }
}
