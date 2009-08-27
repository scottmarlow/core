package org.jboss.webbeans.bootstrap.api.test;

import java.util.Collection;

import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.jboss.webbeans.injection.spi.JpaInjectionServices;

public class MockJpaServices implements JpaInjectionServices
{
   
   public Collection<Class<?>> discoverEntities()
   {
      return null;
   }
   
   public EntityManager resolvePersistenceContext(InjectionPoint injectionPoint)
   {
      return null;
   }
   
   public EntityManagerFactory resolvePersistenceUnit(InjectionPoint injectionPoint)
   {
      return null;
   }
   
}
