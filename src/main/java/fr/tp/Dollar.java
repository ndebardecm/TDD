package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public class Dollar extends Money{

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

}
