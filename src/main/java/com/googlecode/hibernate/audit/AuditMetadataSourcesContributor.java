package com.googlecode.hibernate.audit;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.spi.MetadataSourcesContributor;

/**
 * Populates {@link org.hibernate.boot.MetadataSources} with audit.hbm.xml resources.
 * <p>
 * Created by EugenMaysyuk on 8/3/2017.
 */
public class AuditMetadataSourcesContributor implements MetadataSourcesContributor {

    private static final String DEFAULT_AUDIT_MODEL_HBM_PATH = "com/googlecode/hibernate/audit/model/";
    private static final String DEFAULT_AUDIT_MODEL_HBM_NAME = "audit.hbm.xml";
    private static final String DEFAULT_AUDIT_MODEL_HBM_LOCATION = DEFAULT_AUDIT_MODEL_HBM_PATH + DEFAULT_AUDIT_MODEL_HBM_NAME;

    /**
     * Register audit.hbm.xml mapping at runtime using {@link org.hibernate.boot.MetadataSources} object.
     */
    @Override
    public void contribute(MetadataSources metadataSources) {
        metadataSources.addResource(DEFAULT_AUDIT_MODEL_HBM_LOCATION);
    }

    /*
    public void contribute(MetadataSources metadataSources) {
        // We don't have access to SessionFactory properties from this service so I leaved code below
        // commented just in case Hibernate team will add the ability to access SessionFactory properties in further releases.

        String auditMappingFileProperty = metadataSources.getServiceRegistry().getService(ConfigurationService.class).getSetting(HibernateAudit.AUDIT_MAPPING_FILE_PROPERTY, StandardConverters.STRING, null);
        if (auditMappingFileProperty != null) {
            metadataSources.addResource(auditMappingFileProperty);
        } else {
            try {
                Properties properties = new Properties();
                properties.putAll(metadataSources.getServiceRegistry().getService(ConfigurationService.class).getSettings());
                String dialectName = getDialectName(Dialect.getDialect(properties));
                try {
                    metadataSources.addResource(AuditListener.DEFAULT_AUDIT_MODEL_HBM_PATH + dialectName + "-" + AuditListener.DEFAULT_AUDIT_MODEL_HBM_NAME);
                } catch (MappingNotFoundException e) {
                    metadataSources.addResource(AuditListener.DEFAULT_AUDIT_MODEL_HBM_LOCATION);
                }
            } catch (HibernateException e) {
                // can't find the dialect - procceed as usual.
                metadataSources.addResource(AuditListener.DEFAULT_AUDIT_MODEL_HBM_LOCATION);
            }
        }
    }

    private String getDialectName(Dialect d) {
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
    */
}
