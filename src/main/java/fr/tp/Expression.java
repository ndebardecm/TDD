package fr.tp;

/**
 * Created by nico on 12/01/2015.
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
