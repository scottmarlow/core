package org.jboss.weld.tests.resources;

import javax.ejb.Singleton;
import javax.enterprise.inject.Produces;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Singleton
public class JPAResourceProducerSingletonEJB_StaticField {
    @Produces
    @PersistenceUnit(unitName = "pu1")
    @ProducedViaStaticFieldOnEJB
    public static EntityManagerFactory customerDatabasePersistenceUnit1;
}
