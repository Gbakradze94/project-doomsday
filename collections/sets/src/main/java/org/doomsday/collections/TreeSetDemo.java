package org.doomsday.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(4);
        integerTreeSet.add(50);
        integerTreeSet.add(35);
        integerTreeSet.add(14);

        System.out.println(integerTreeSet.headSet(35));
    }
}
