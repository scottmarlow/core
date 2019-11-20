package org.jboss.weld.examples.login;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.logging.Logger;

public class Resources {

    // Expose an entity manager using the resource producer pattern
    @SuppressWarnings("unused")
    @PersistenceContext
    @Produces
    private EntityManager em;

    @Produces
    Logger getLogger(InjectionPoint ip) {
        String category = ip.getMember().getDeclaringClass().getName();
        return Logger.getLogger(category);
    }

}
