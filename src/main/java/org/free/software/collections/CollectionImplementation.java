package org.free.software.collections;

/**
 * Created by Freak on 06/03/2018.
 */
public interface CollectionImplementation<T> {
    Collection<T> add(T element);

    Collection<T> create();

    Collection<T> create(T... elements);

    Collection<T> create(java.util.Collection<T> elements);

    boolean contains(T element);

    <T> java.util.Collection<T> asJavaCollection();

    Integer size();
}
