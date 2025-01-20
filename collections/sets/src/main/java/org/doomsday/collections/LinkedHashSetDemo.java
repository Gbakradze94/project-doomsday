package org.doomsday.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(4);
        integers.add(8);

        integers.forEach(System.out::println);

        integers.addFirst(100);

        integers.forEach(System.out::print);
    }
}
