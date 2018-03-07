package org.free.software.collections;

import java.util.ArrayList;

/**
 * Created by Freak on 06/03/2018.
 */
public class Collection<T extends Comparable> implements CollectionImplementation<T> {

    private boolean mutable = true;
    private JdkListType jdkListType;
    private LibraryType libraryType;
    private CollectionImplementation<T> implementation;

    public Collection() {
    }

    public Collection(CollectionImplementation<T> backingImplementation) {
        implementation = backingImplementation;
    }

    public Collection<T> asMutable() {
        this.mutable = true;
        return this;
    }

    public Collection<T> asJdk() {
        this.libraryType = LibraryType.JDK;
        return this;
    }

    @Override
    public Collection<T> add(T element) {
        return implementation.add(element);
    }

    public Collection<T> asArrayList() {
        this.jdkListType = JdkListType.ARRAY_LIST;
        return this;
    }

    public Collection<T> create() {
        if (this.libraryType.equals(LibraryType.JDK) && this.jdkListType.equals(JdkListType.ARRAY_LIST)) {
            implementation = new ArrayLists<T>(mutable);
        }
        return implementation.create();
    }

    @Override
    public boolean contains(Comparable newElement) {
        return implementation.contains((T) newElement);
    }


    public java.util.Collection<T> asJavaCollection() {
        return implementation.asJavaCollection();
    }
}
