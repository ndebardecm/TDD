package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public class Franc {
    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return franc.amount == this.amount;
    }
}
