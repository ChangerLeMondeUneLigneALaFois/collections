package org.free.software.collections.asserts;

import org.assertj.core.api.AbstractAssert;
import org.free.software.collections.Collection;

public class CollectionAssert<T> extends AbstractAssert<CollectionAssert<T>, Collection> {

    public CollectionAssert(Collection actual) {
        super(actual, CollectionAssert.class);
    }

    public static <T> CollectionAssert<T> assertThat(Collection actual) {
        return new CollectionAssert(actual);
    }

    public CollectionAssert hasNewElement(Comparable newElement, Collection oldCollection) {
        isNotNull();

        if (!actual.contains(newElement)) {
            failWithMessage("Expected to find " + newElement + " but did not");
        }

        return this;
    }

    public CollectionAssert isEmpty() {
        isNotNull();

        if ((actual.size() > 0)) {
            failWithMessage("Expected collection to be empty but was of size :" + actual.size());
        }

        return this;
    }

    public CollectionAssert hasSize(Integer size) {
        isNotNull();

        if (!(actual.size().equals(size))) {
            int sizeDifference = actual.size() - size;
            if (sizeDifference < 0) {
                failWithMessage("Missing " + sizeDifference*-1 + " element(s) in \n:" + actual.toJson());
            } else {
                failWithMessage("Found " + sizeDifference + " extra element(s) in \n: " + actual.toJson());
            }
        }

        return this;
    }

    public void contains(T i) {
        if (!actual.contains(i)) {
            failWithMessage("Expected collection to contain :" + i.toString() + " but couldn't find it.");
        }
    }
}