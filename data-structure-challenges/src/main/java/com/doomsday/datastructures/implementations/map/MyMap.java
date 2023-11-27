package com.doomsday.datastructures.implementations.map;

import java.util.Arrays;

public final class MyMap<K, V> {

    private final class MyEntry<K, V> {
        private final K key;
        private V value;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyEntry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private static final int DEFAULT_CAPACITY = 16;

    private int size;

    @SuppressWarnings("unchecked")
    private MyEntry<K, V>[] entries = new MyEntry[DEFAULT_CAPACITY];


    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)) {
                return entries[i].getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {

        boolean success = true;
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)) {
                entries[i].setValue(value);
            }
        }

        if (success) {
            checkCapacity();
            entries[size++] = new MyEntry<>(key, value);
        }
    }

    private void checkCapacity() {
        if (size == entries.length) {
            int newSize = entries.length * 2;
            entries = Arrays.copyOf(entries, newSize);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
