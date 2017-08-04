/**
 * Copyright (C) 2009 Krasimir Chobantonov <kchobantonov@yahoo.com>
 * This file is part of Hibernate Audit.
 * <p>
 * Hibernate Audit is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 3 of the License, or (at your
 * option) any later version.
 * <p>
 * Hibernate Audit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along
 * with Hibernate Audit.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.hibernate.audit.configuration;

import org.hibernate.boot.Metadata;
import org.hibernate.engine.spi.SessionFactoryImplementor;

import com.googlecode.hibernate.audit.extension.ExtensionManager;
import com.googlecode.hibernate.audit.synchronization.AuditSynchronizationManager;

public class AuditConfiguration {
    private AuditSynchronizationManager auditSynchronizationManager = new AuditSynchronizationManager(this);
    private ExtensionManager extensionManager = new ExtensionManager();
    private SessionFactoryImplementor sessionFactory;
    private Metadata metadata;

    public AuditConfiguration(SessionFactoryImplementor sessionFactory, Metadata metadata) {
        this.sessionFactory = sessionFactory;
        this.metadata = metadata;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public SessionFactoryImplementor getSessionFactory() {
        return sessionFactory;
    }

    public AuditSynchronizationManager getAuditSynchronizationManager() {
        return auditSynchronizationManager;
    }

    public ExtensionManager getExtensionManager() {
        return extensionManager;
    }

}