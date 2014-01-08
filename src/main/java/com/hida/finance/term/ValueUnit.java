package com.hida.finance.term;

/**
 * Created by arief.hidayat on 1/8/14.
 */
class ValueUnit<T> {
    public final double value;
    public final T unit;
    protected ValueUnit(T unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public String toString() {
        return value + " " + unit;
    }
}
