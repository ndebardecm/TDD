package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public class Dollar extends Money{

    public Dollar(int amount, String currency){
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }

    public String currency(){
        return currency;
    }

}
