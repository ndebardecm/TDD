package fr.tp;

/**
 * Created by nico on 11/01/2015.
 */
public class Franc extends Money{

    public Franc(int amount, String currency){
        super(amount, currency);
    }

    public String currency(){
        return currency;
    }

}
