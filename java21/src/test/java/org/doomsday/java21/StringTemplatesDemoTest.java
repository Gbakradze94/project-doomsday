package org.doomsday.java21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTemplatesDemoTest {

    private final StringTemplatesDemo stringTemplatesDemo = new StringTemplatesDemo();


    @Test
    void useStringTemplateForProductDetails() {
        String result = stringTemplatesDemo.useStringTemplateForProductDetails();
        Assertions.assertEquals("Product id is: 1 and the name is: IPhone", result);
    }
}