package org.gbakradze;


import java.util.*;

public class SequencedCollectionsDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.getFirst();
        Set<String> set = new HashSet<>();

        SequencedCollection<String> sequencedCollection = new ArrayList<>();
        sequencedCollection.getFirst();
    }
}