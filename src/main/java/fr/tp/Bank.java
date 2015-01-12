package fr.tp;

/**
 * Created by nico on 12/01/2015.
 */
public class Bank {

    Money reduce (Expression source, String to){
        return source.reduce(to);
    }
}
