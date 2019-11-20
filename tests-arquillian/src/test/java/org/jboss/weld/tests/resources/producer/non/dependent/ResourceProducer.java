package org.jboss.weld.tests.resources.producer.non.dependent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ResourceProducer {

    @SuppressWarnings("unused")
    @Produces
    @ApplicationScoped
    @PersistenceContext(unitName = "pu1")
    private EntityManager entityManager;

}
