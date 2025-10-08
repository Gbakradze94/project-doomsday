package org.gbakradze;


import java.util.*;

public class NonSequencedCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Deque<String> deque = new ArrayDeque<>();
        Collection<String> collection = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        Integer first = set.iterator().hasNext() ? set.iterator().next() : null;
        System.out.println(set.size());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
    }
}