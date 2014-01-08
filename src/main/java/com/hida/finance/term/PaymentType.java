package com.hida.finance.term;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public enum PaymentType {
    CASH("cash"), CREDIT("credit");
    private final String text;
    private PaymentType(String txt) {
        this.text = txt;
    }
    public String toString() {
        return this.text;
    }
}
