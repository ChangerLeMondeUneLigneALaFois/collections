package org.free.software.collections;

/**
 * Created by Freak on 06/03/2018.
 */
public interface CollectionImplementation<T extends Comparable> {
    Collection<T> add(T element);

    Collection<T> create();

    boolean contains(T element);

    <T extends Comparable> java.util.Collection<T> asJavaCollection();
}
