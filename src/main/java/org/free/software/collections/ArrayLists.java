package org.free.software.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Freak on 06/03/2018.
 */
public class ArrayLists<T extends Comparable> implements CollectionImplementation<T> {

    private boolean mutable;

    public ArrayLists(boolean mutable) {
        this.mutable = mutable;
        this.backingArrayList = new ArrayList<>();
    }

    private ArrayList<T> backingArrayList;

    public ArrayLists(boolean mutable, ArrayList<T> newClasses) {
        this.mutable = mutable;
        this.backingArrayList = newClasses;
    }

    @Override
    public Collection<T> add(Comparable element) {
        ArrayList<T> newClasses = new ArrayList<>();
        newClasses.addAll(backingArrayList);
        newClasses.add((T)element);
        return new Collection<T>(new ArrayLists<T>(mutable, newClasses));
    }

    @Override
    public java.util.Collection<T> asJavaCollection() {
        return backingArrayList;
    }

    @Override
    public Collection<T> create() {
        backingArrayList = new ArrayList<>();
        return new Collection<T>(this);
    }

    @Override
    public boolean contains(Comparable element) {
        return backingArrayList.contains(element);
    }
}
