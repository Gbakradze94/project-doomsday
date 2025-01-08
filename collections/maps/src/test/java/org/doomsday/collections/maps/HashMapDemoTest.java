package org.doomsday.collections.maps;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashMapDemoTest {

    private final HashMap<String, String> hashMap = new HashMap<>();
    private final HashMapDemo hashMapDemo = new HashMapDemo(hashMap);

    @Test
    void testPutElement() {
        hashMapDemo.putElement("Hello", "World");
        assertEquals("World", hashMapDemo.getHashMap().get("Hello"));
    }

    /**
     * In HashMap, if you try to put the new value for the same key, the old value
     * will be overwritten.
     */
    @Test
    void testPutElementWithSameKeyAndDifferentValue() {
        hashMapDemo.putElement("Hello", "Friend");
        assertEquals("Friend", hashMapDemo.getHashMap().get("Hello"));
    }

    @Test
    void testPutValueWithNullKey() {
        hashMapDemo.putElement(null, "Value");
        assertEquals("Value", hashMap.get(null));
    }

    /**
     *
     */
    @Test
    void testOnlySingleElementWithNullKey() {
        hashMap.put(null, "Value");
        int startingElementCount = hashMap.size();
        String overwrittenValue = "Another Value";

        hashMap.put(null, "Another Value");
        assertEquals(startingElementCount, hashMap.size());
        assertEquals(overwrittenValue, hashMap.get(null));
    }
}