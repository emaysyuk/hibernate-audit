package com.googlecode.hibernate.audit.collector;

import org.hibernate.HibernateException;
import org.hibernate.boot.MappingNotFoundException;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.*;

import com.googlecode.hibernate.audit.HibernateAudit;
import com.googlecode.hibernate.audit.listener.AuditListener;

/**
 * This class holds the {@link org.hibernate.cfg.Configuration} object that will be used
 * by {@link com.googlecode.hibernate.audit.AuditIntegrator} at runtime to get session factory configuration properties
 * and check com.googlecode.hibernate.audit.listener.autoRegister property value.
 *
 * The {@link org.hibernate.cfg.Configuration} object also will be used inside AuditListener object to check some
 * properties values.
 *
 * @author Eugen Maysyuk
 */
public abstract class HibernateConfigurationCollector {

    private static Configuration configuration;

    public static void collectConfiguration(Object config) {
        configuration = (Configuration) config;

        if (configuration.getProperty(HibernateAudit.AUDIT_MAPPING_FILE_PROPERTY) != null) {
            configuration.addResource(configuration.getProperty(HibernateAudit.AUDIT_MAPPING_FILE_PROPERTY));
        } else {
            try {
                String dialectName = getDialectName(Dialect.getDialect(configuration.getProperties()));
                try {
                    configuration.addResource(AuditListener.DEFAULT_AUDIT_MODEL_HBM_PATH + dialectName + "-" + AuditListener.DEFAULT_AUDIT_MODEL_HBM_NAME);
                } catch (MappingNotFoundException e) {
                    configuration.addResource(AuditListener.DEFAULT_AUDIT_MODEL_HBM_LOCATION);
                }
            } catch (HibernateException e) {
                // can't find the dialect - procceed as usual.
                configuration.addResource(AuditListener.DEFAULT_AUDIT_MODEL_HBM_LOCATION);
            }
        }
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    private static String getDialectName(Dialect d) {
        if (d instanceof Oracle8iDialect) { // also applicable for Oracle9iDialect because it extends Oracle8iDialect
            return "oracle";
        } else if (d instanceof SQLServerDialect) {
            return "sqlserver";
        } else if (d instanceof MySQLDialect) {
            return "mysql";
        } else if (d instanceof SybaseDialect) {
            return "sybase";
        } else if (d instanceof Cache71Dialect) {
            return "cache71";
        } else if (d instanceof DB2Dialect) {
            return "db2";
        } else if (d instanceof FrontBaseDialect) {
            return "frontbase";
        } else if (d instanceof H2Dialect) {
            return "h2";
        } else if (d instanceof HSQLDialect) {
            return "hsql";
        } else if (d instanceof InformixDialect) {
            return "informix";
        } else if (d instanceof IngresDialect) {
            return "ingres";
        } else if (d instanceof InterbaseDialect) {
            return "interbase";
        } else if (d instanceof JDataStoreDialect) {
            return "jdatastore";
        } else if (d instanceof MckoiDialect) {
            return "mckoi";
        } else if (d instanceof MimerSQLDialect) {
            return "mimersql";
        } else if (d instanceof PointbaseDialect) {
            return "pointbase";
        } else if (d instanceof PostgreSQL81Dialect || d instanceof ProgressDialect) {
            return "postgresql";
        } else if (d instanceof RDMSOS2200Dialect) {
            return "rdmsos2200";
        } else if (d instanceof SAPDBDialect) {
            return "sapdb";
        } else if (d instanceof TeradataDialect) {
            return "teradata";
        } else if (d instanceof TimesTenDialect) {
            return "timesten";
        }

        return d.getClass().getSimpleName();
    }
}
