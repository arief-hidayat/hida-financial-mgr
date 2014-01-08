package com.hida.finance.term;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public class Quantity extends ValueUnit<QtyUnit> {
    private Quantity(QtyUnit unit, double amount) {  super(unit, amount); }
    public static Quantity Kg(double amount) {
        return new Quantity(QtyUnit.KG, amount);
    }
    public static Quantity Pc(double amount) {
        return new Quantity(QtyUnit.PC, amount);
    }
}
