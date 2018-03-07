package org.free.software.collections;

/**
 * Created by Freak on 06/03/2018.
 */
public class Collections<T> {

    public static <T extends Comparable> Collection<T> asMutable() {
        return new Collection<T>().asMutable();
    }

}
