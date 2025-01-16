package org.doomsday.collections.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MutableKeyTest {

    private Student john = new Student(1, "John");
    private final HashMap<Student, Integer> grades = new HashMap<>();
    private final MutableKey mutableKey = new MutableKey(grades);

    @Test
    void testPutGradeByStudent() {
        mutableKey.putGrade(john, 2);
        assertEquals(2, mutableKey.getGrades().get(john));
    }

    @Test
    void testPutAnotherGradeForTheSameKeyGetsDuplicated() {
        grades.put(john, 3);
        grades.put(john, 4);
        john.setName("Mary");
        assertNotEquals(4, grades.get(john));
    }

}