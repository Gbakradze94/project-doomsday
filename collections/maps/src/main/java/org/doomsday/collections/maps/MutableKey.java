package org.doomsday.collections.maps;

import java.util.HashMap;

public class MutableKey {
    private final HashMap<Student, Integer> grades;

    public MutableKey(HashMap<Student, Integer> grades) {
        this.grades = grades;
    }

    public HashMap<Student, Integer> getGrades() {
        return grades;
    }

    public void putGrade(Student key, Integer grade) {
        grades.put(key, grade);
    }
}
