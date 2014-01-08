package com.hida.finance.term;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public enum QtyUnit {
    PC("pc"), KG("kg");
    private final String text;
    private QtyUnit(String txt) {
        this.text = txt;
    }
    public String toString() {
        return this.text;
    }
}
