package org.doomsday.collections.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MutableKeyTest {

    private Student john = new Student(1, "John");
    private final HashMap<Student, Integer> grades = new HashMap<>();

    @Test
    void testPutGradeByStudent() {
        grades.put(john, 2);
        assertEquals(2, grades.get(john));
    }

    @Test
    void testMutableKeyPropertyValueChange_failsToLookUpTheKey() {
        grades.put(john, 3);
        grades.put(john, 4);
        john.setName("Mary");
        assertNotEquals(4, grades.get(john));
    }

}