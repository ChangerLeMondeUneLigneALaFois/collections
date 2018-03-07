package org.free.software.collections;

import org.junit.Test;

import java.util.ArrayList;

import static org.free.software.collections.asserts.CollectionAssert.assertThat;

/**
 * Created by Freak on 06/03/2018.
 */
public class JePeuxAjouterUnElementAUneCollection {

    @Test
    public void i_can_add_an_element_to_a_collection() {

        Collection<Integer> collection = Collections.create();

        Collection<Integer> newCollection = collection.add(3);

        assertThat(newCollection).hasNewElement(3, collection);
    }
}
