package com.hida.finance.term;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public class Cost extends ValueUnit<Currency> {
    private Cost(Currency unit, double amount) {  super(unit, amount); }
    public static Cost Rp(double amount) {
        return new Cost(Currency.RUPIAH, amount);
    }
    public static Cost S$(double amount) {
        return new Cost(Currency.SGD, amount);
    }
    public String toString() {
        return unit + " " + value;
    }
}
