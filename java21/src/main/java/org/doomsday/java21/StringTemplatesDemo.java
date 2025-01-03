package org.doomsday.java21;

import static java.lang.StringTemplate.STR;

public class StringTemplatesDemo {
    Product product = new Product(1L, "IPhone");


    public String useStringTemplateForProductDetails() {
        return STR."Product id is: \{product.productId()} and the name is: \{product.productName()}";
    }
}
