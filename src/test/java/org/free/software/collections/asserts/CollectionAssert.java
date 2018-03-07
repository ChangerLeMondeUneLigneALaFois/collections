package org.free.software.collections.asserts;

import org.assertj.core.api.AbstractAssert;
import org.free.software.collections.Collection;

public class CollectionAssert extends AbstractAssert<CollectionAssert, Collection> {

    public CollectionAssert(Collection actual) {
        super(actual, CollectionAssert.class);
    }

    public static CollectionAssert assertThat(Collection actual) {
        return new CollectionAssert(actual);
    }

    public CollectionAssert hasNewElement(Comparable newElement, Collection oldCollection) {
        isNotNull();

        if (!actual.contains(newElement)) {
            failWithMessage("Expected to find " + newElement + " but did not");
        }

        return this;
    }
}