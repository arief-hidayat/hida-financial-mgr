package com.hida.finance.term;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public enum Currency {
    RUPIAH("Rp"), SGD("S$");
    private final String text;
    Currency(String txt) {
       this.text = txt;
    }
    public String toString() {
        return this.text;
    }
}
