package org.free.software.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by Freak on 06/03/2018.
 */
public class Collection<T> implements CollectionImplementation<T> {

    private boolean mutable = true;
    private JdkListType jdkListType = JdkListType.ARRAY_LIST;
    private LibraryType libraryType = LibraryType.JDK;
    private final CollectionImplementation<T> implementation;

    public Collection() {
        implementation = new ArrayLists<>(false);
    }

    public Collection(CollectionImplementation<T> backingImplementation) {
        implementation = backingImplementation;
    }

    @Override
    public Collection<T> add(T element) {
        return implementation.add(element);
    }

    public Collection<T> create() {
        return implementation.create();
    }

    @Override
    public Collection<T> create(T... elements) {
        return implementation.create(elements);
    }

    @Override
    public Collection<T> create(java.util.Collection<T> elements) {
        return implementation.create(elements);
    }

    @Override
    public Integer size() {
        return implementation.size();
    }

    @Override
    public boolean contains(T newElement) {
        return implementation.contains(newElement);
    }

    public java.util.Collection<T> asJavaCollection() {
        return implementation.asJavaCollection();
    }

    public String toJson() {
        return "{ " + implementation.asJavaCollection().stream().map(Object::toString).collect(Collectors.joining(", ")) + " }";
    }
}
