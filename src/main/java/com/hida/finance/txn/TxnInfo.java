package com.hida.finance.txn;

import com.hida.finance.item.PayableItem;
import com.hida.finance.term.Cost;
import com.hida.finance.term.PaymentType;
import com.hida.finance.term.Quantity;
import org.joda.time.LocalDateTime;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public class TxnInfo<T extends PayableItem> {
    private final T item;
    private final Cost totalCost;
    private final Quantity qty;
    private final LocalDateTime time;
    // method of payment? cash, credit/debit
    private final PaymentType paymentType;
    // might add more like unit price, discount, etc.


    public static class Builder<T> {
        private final T item;
        private final Cost totalCost;
        private final Quantity qty;
        private LocalDateTime time;
        private PaymentType paymentType;

        public Builder(T item, Cost totalCost, Quantity qty) {
            this.item = item;
            this.totalCost = totalCost;
            this.qty = qty;
            this.paymentType = PaymentType.CASH;
        }
        public Builder at(LocalDateTime time) { this.time = time; return this; }
        public Builder paymentBy(PaymentType paymentType) { this.paymentType = paymentType; return this; }
        public TxnInfo build() { return new TxnInfo(this); }
    }
    private TxnInfo(Builder<T> builder) {
        item = builder.item;
        totalCost = builder.totalCost;
        qty = builder.qty;
        time = builder.time;
        paymentType = builder.paymentType;
    }
}
