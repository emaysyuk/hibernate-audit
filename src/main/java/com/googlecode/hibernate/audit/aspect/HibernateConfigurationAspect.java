package com.googlecode.hibernate.audit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.googlecode.hibernate.audit.collector.HibernateConfigurationCollector;

/**
 * This aspect needs to catch {@link org.hibernate.cfg.Configuration} object before session factory is built
 * since Hibernate migrated to new bootstrap API and {@link org.hibernate.cfg.Configuration} object is no longer
 * available inside {@link com.googlecode.hibernate.audit.AuditIntegrator}.
 *
 * If the {@link org.hibernate.cfg.Configuration} object is only used to get
 * session factory properties values we can remove {@link HibernateConfigurationAspect} class and get
 * session factory properties values from {@link org.hibernate.engine.spi.SessionFactoryImplementor} object
 * inside {@link com.googlecode.hibernate.audit.AuditIntegrator}.
 *
 * @author Eugen Maysyuk
 */
@Aspect
public class HibernateConfigurationAspect {

    /**
     * Pointcut
     *
     */
    @Pointcut("execution(* org.hibernate.cfg.Configuration.buildSessionFactory(org.hibernate.service.ServiceRegistry))")
    public void buildSessionFactory() {
    }

    /**
     * Advice
     *
     */
    @Around("buildSessionFactory()")
    public Object beforeAdvice(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        Object config = thisJoinPoint.getThis(); // org.hibernate.cfg.Configuration
        HibernateConfigurationCollector.collectConfiguration(config);
        return thisJoinPoint.proceed(thisJoinPoint.getArgs());
    }
}
