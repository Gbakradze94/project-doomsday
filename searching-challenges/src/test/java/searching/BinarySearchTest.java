package searching;

import org.doomsday.searching.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void whenBinarySearchRecursive_returnSearchedResult() {
        int[] inputArray = { 1, 3, 5, 6 };
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearchRecursive(inputArray, 5, 0, inputArray.length);
        System.out.println(result);
        assertEquals(2,result);
    }
}