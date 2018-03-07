package org.free.software.collections;

/**
 * Created by Freak on 06/03/2018.
 */
public class Collections<T> {

    public static <T> Collection<T> create() { return new Collection<T>().create(); }

    public static <T> Collection<T> create(T... elements) { return new Collection<T>().create(elements); };

    public static <T> Collection<T> create(java.util.Collection<T> elements) {
        return new Collection<T>().create(elements);
    }
}
