package org.doomsday.matrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixPathsTest {

    private final MatrixPaths matrixPaths = new MatrixPaths();

    @Test
    void testCountPaths() {
        int rows = 2;
        int columns = 2;
        int startRow = 1;
        int startColumn = 1;

        int ways = matrixPaths.countPaths(rows, columns, startRow, startColumn);
        System.out.println(ways);
        assertEquals(ways, 2);

    }
}