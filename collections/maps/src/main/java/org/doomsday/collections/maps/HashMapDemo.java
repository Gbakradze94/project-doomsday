package org.doomsday.collections.maps;

import java.util.HashMap;

public class HashMapDemo {

    private final HashMap<String, String> hashMap;

    public HashMapDemo(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public void putElement(String key, String value) {
        hashMap.put(key, value);
    }
}
