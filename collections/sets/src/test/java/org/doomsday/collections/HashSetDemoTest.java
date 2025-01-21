package org.doomsday.collections;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashSetDemoTest {
    private static final HashSet<Integer> hashSetOfIntegers = new HashSet<>();

    @BeforeAll
    static void init() {
        hashSetOfIntegers.add(7);
        hashSetOfIntegers.add(7);
        hashSetOfIntegers.add(7);
        hashSetOfIntegers.add(2);
    }

    @Test
    void testHashSetAddsElementOnlyOnce() {
        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.printIntegers(hashSetOfIntegers);
        assertEquals(2, hashSetOfIntegers.size());
    }

}