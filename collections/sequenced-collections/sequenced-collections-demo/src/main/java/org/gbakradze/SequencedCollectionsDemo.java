package org.gbakradze;


import java.util.*;

public class SequencedCollectionsDemo {
    public static void main(String[] args) {
        sequencedCollectionDemo();
        sequencedSetDemo();
        sequencedMapDemo();
    }

    private static void sequencedCollectionDemo() {
        SequencedCollection<Integer> sequencedCollection = new ArrayList<>();
        sequencedCollection.addFirst(3);
        sequencedCollection.addFirst(2);
        sequencedCollection.addFirst(1);
        sequencedCollection.addLast(0);

        System.out.println(sequencedCollection);
        System.out.println("First Element: " + sequencedCollection.getFirst());
        System.out.println("Last Element: " + sequencedCollection.getLast());
        System.out.println("Remove First Element: " + sequencedCollection.removeFirst());
        System.out.println("Remove Last Element: " + sequencedCollection.removeLast());
        System.out.println("Print after removal: " + sequencedCollection);
        System.out.println("Reverse : " + sequencedCollection.reversed());
    }

    private static void sequencedMapDemo() {
        SequencedMap<Integer, String> sequencedMap = new LinkedHashMap<>();
        sequencedMap.putFirst(1, "Ann");
        sequencedMap.putFirst(2, "James");
        sequencedMap.putFirst(3, "Thomas");
        System.out.println(sequencedMap);
        System.out.println("First entry: " + sequencedMap.firstEntry());
        System.out.println("Last entry: " + sequencedMap.lastEntry());
        System.out.println("Poll first entry: " + sequencedMap.pollFirstEntry());
        System.out.println("Poll last entry: " + sequencedMap.pollLastEntry());
        System.out.println(sequencedMap);

        System.out.println("Iterate forwards!");
        for (Map.Entry<Integer, String> entry : sequencedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Iterate backwards");
        for (Map.Entry<Integer, String> entry : sequencedMap.reversed().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void sequencedSetDemo() {
        SequencedSet<Integer> sequencedSet = new LinkedHashSet<>();
        sequencedSet.addFirst(2);
        sequencedSet.addFirst(1);
        sequencedSet.addLast(3);
        sequencedSet.addLast(4);
        System.out.println(sequencedSet);
        System.out.println("Get first: " + sequencedSet.getFirst());
        System.out.println("Get last: " + sequencedSet.getLast());
        System.out.println("Remove first: " + sequencedSet.removeFirst());
        System.out.println("Remove last: " + sequencedSet.removeLast());

        System.out.println("Iterate forwards");
        for (Integer integer : sequencedSet) {
            System.out.println(integer);
        }

        System.out.println("Iterate backwards");
        for (Integer integer : sequencedSet.reversed()) {
            System.out.println(integer);
        }
    }
}
