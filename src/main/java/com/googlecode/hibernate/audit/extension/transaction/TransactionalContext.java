package com.googlecode.hibernate.audit.extension.transaction;

import org.hibernate.Session;

/**
 * TransactionalContext.
 *
 * @author evgeni.gordeev
 */
public interface TransactionalContext {
    void runInTx(Session session, TxCallback callback);
}
