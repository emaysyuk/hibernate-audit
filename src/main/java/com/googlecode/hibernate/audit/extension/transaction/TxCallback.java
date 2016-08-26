package com.googlecode.hibernate.audit.extension.transaction;

/**
 * TxCallback.
 *
 * @author evgeni.gordeev
 */
public interface TxCallback {
    void execute();
}
