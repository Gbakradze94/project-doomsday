package org.gbakradze;


import org.gbakradze.records.RecordsDemo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RecordsDemoTest {

    @Test
    void testCanonicalConstructorCostArgumentCheck() {
        assertThrows(IllegalArgumentException.class, () -> {
            RecordsDemo recordsDemo = new RecordsDemo();
            recordsDemo.canonicalConstructorCostArgumentCheck("Smartphone", BigDecimal.valueOf(-499.99), "Electronics");
        });
    }

    @Test
    void printRecordDetails() {
        // TODO: Add test content
    }
}