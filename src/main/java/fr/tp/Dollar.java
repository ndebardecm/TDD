package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public class Dollar {
    public int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public void times(int t) {
        this.amount = this.amount * t;
    }
}
