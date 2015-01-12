package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */

interface Expression {

}

public class Money implements Expression {

    protected int amount;
    protected String currency;

    Money (int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    String currency(){
        return this.currency;
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return money.amount == this.amount && currency().equals(money.currency());
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    public String toString(){
        return amount + " " + currency;
    }
}
