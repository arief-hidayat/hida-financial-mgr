package com.hida.finance;

import com.hida.finance.item.Product;
import com.hida.finance.item.Service;
import com.hida.finance.term.Cost;
import com.hida.finance.term.PaymentType;
import com.hida.finance.term.Quantity;
import com.hida.finance.txn.ServiceAction;
import com.hida.finance.txn.TxnInfo;
import org.joda.time.LocalDateTime;

/**
 * Created by arief.hidayat on 1/8/14.
 */
public class FinancialMgr implements ServiceAction {

    private void test() {
        TxnInfo txnInfo = new TxnInfo.Builder(new Product(), Cost.Rp(10_000.00), Quantity.Pc(1)).
                at(LocalDateTime.now()).paymentBy(PaymentType.CREDIT).
                build();
        FinancialMgr mgr = new FinancialMgr();
        mgr.useService(new TxnInfo.Builder(new Service(), Cost.S$(35.50), Quantity.Kg(0.2)).
                at(LocalDateTime.now().minusDays(1)).build());
    }

    @Override
    public void useService(TxnInfo info) {

    }
}
