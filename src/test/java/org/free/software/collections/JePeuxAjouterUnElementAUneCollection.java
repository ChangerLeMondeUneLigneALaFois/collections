package org.free.software.collections;

import org.junit.Test;

import static org.free.software.collections.asserts.CollectionAssert.assertThat;

/**
 * Created by Freak on 06/03/2018.
 */
public class JePeuxAjouterUnElementAUneCollection {

    @Test
    public void i_can_add_an_element_to_a_collection() {

        Collection<Comparable> collection = Collections.asMutable().asJdk().asArrayList().create();

        Collection<Comparable> newCollection = collection.add(3);

        assertThat(newCollection).hasNewElement(3, collection);
    }
}
