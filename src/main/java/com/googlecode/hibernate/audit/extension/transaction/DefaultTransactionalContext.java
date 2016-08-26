package com.googlecode.hibernate.audit.extension.transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * TransactionalContext.
 *
 * @author evgeni.gordeev
 */
public class DefaultTransactionalContext implements TransactionalContext {
    @Override
    public void runInTx(Session session, TxCallback callback) {
        Transaction tx = session.beginTransaction();
        callback.execute();
        tx.commit();
    }
}
