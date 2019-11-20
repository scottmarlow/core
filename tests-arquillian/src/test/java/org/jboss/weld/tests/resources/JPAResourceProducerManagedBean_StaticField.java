package org.jboss.weld.tests.resources;

import javax.enterprise.inject.Produces;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

public class JPAResourceProducerManagedBean_StaticField {
    @Produces
    @PersistenceUnit(unitName = "pu1")
    @ProducedViaStaticFieldOnManagedBean
    public static EntityManagerFactory customerDatabasePersistenceUnit1;
}
