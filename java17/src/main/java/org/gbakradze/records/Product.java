package org.gbakradze.records;

import java.math.BigDecimal;

public record Product(String name, BigDecimal cost, String type) {
    /**
     * This is the costructor, which is not compact.
     */
    /*
    public Product(String name, BigDecimal cost, String type) {
        if (cost.signum() < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.name = name;
        this.cost = cost;
        this.type = type;
    }
    */

    /**
     * This succinct form of constructor declaration is only possible in records.
     * Note that statements this.name = name; this cost = cost; and this.type = type;,
     * which appear in canonical constructor, do not appear in compact constructor.
     * At the end of compact constructor, its implicit formal parameters are
     * assigned to the record class's private fields corresponding to its components.
     * @param name Name of the product.
     * @param cost Cost of the product.
     * @param type Type of the product.
     * @throws IllegalArgumentException if cost is negative.
     */
    public Product {
        if (cost.signum() < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
    }
}
