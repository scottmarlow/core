package org.jboss.weld.annotated.slim.backed;

import java.lang.reflect.Type;
import java.util.Set;

import javax.enterprise.inject.spi.AnnotatedMember;

import org.jboss.weld.resources.ReflectionCache;
import org.jboss.weld.resources.SharedObjectCache;
import org.jboss.weld.util.LazyValueHolder;
import org.jboss.weld.util.reflection.RawType;
import org.jboss.weld.util.reflection.Reflections;

public abstract class BackedAnnotatedMember<X> extends BackedAnnotated implements AnnotatedMember<X> {

    private BackedAnnotatedType<X> declaringType;

    public BackedAnnotatedMember(Type baseType, BackedAnnotatedType<X> declaringType, SharedObjectCache sharedObjectCache) {
        super(baseType, sharedObjectCache);
        this.declaringType = declaringType;
    }

    @Override
    protected LazyValueHolder<Set<Type>> initTypeClosure(Type baseType, SharedObjectCache cache) {
        return cache.getTypeClosureHolder(RawType.wrap(baseType));
    }

    public boolean isStatic() {
        return Reflections.isStatic(getJavaMember());
    }

    public BackedAnnotatedType<X> getDeclaringType() {
        return declaringType;
    }

    @Override
    protected ReflectionCache getReflectionCache() {
        return getDeclaringType().getReflectionCache();
    }
}
