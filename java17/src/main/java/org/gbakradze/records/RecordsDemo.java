package org.gbakradze.records;

import java.math.BigDecimal;


public class RecordsDemo {

    /**
     * Demonstrates creation of Product record with invalid cost to trigger exception
     * from canonical constructor.
     * @param productName Product name.
     * @param cost Product cost, which should be non-negative.
     * @param productType Product type.
     * @throws IllegalArgumentException if cost is negative.
     */
    public void canonicalConstructorCostArgumentCheck(String productName, BigDecimal cost, String productType) {
        try {
            Product invalidProduct = new Product(productName, cost, productType);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Caught exception: " + e.getMessage());
        }
    }

    /**
     * toString() method is automatically generated for records
     */
    public void printRecordDetails() {
        Product product = new Product("Laptop", BigDecimal.valueOf(999.99), "Electronics");
        System.out.println(product);
    }
}
