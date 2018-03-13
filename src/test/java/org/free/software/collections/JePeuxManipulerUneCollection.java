package org.free.software.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.free.software.collections.asserts.CollectionAssert.assertThat;

/**
 * Created by Freak on 06/03/2018.
 */
public class JePeuxManipulerUneCollection {

    @Test
    public void i_can_add_an_element_to_a_collection() {

        Collection<Integer> collection = Collections.create();

        Collection<Integer> newCollection = collection.add(3);

        assertThat(newCollection).hasNewElement(3, collection);
    }

    @Test
    public void new_collection_is_empty() {
        Collection<Integer> collection = Collections.create();

        assertThat(collection).isEmpty();
    }

    @Test
    public void can_create_collection_with_varargs() {
        Collection<Integer> collection = Collections.create(3, 4);

        assertThat(collection).hasSize(2);
    }

    @Test
    public void can_create_collection_with_collection() {
        Collection<Integer> collection = Collections.create(Arrays.asList(1, 2));

        assertThat(collection).hasSize(2);
    }

    @Test
    public void can_check_if_element_is_part_of_collection() {
        Collection<Integer> collection = Collections.create(1);

        assertThat(collection).contains(1);
    }

}
