package org.gbakradze.finalkeyword;

import org.gbakradze.passbyvalue.Customer;

/**
 * Final variable means that the reference cannot be changed after it has been assigned.
 * However, the object it points to can still be modified if it is mutable.
 * In this example, the final variable 'c' cannot be reassigned to a new Customer
 * object after it has been initialized, but the properties of the Customer
 * object can still be modified
 */
public class FinalKeyWordDemo {

    public static void main(String[] args) {
        final Customer c;
        c = new Customer("Sally");
        c.setName("Diane");
        //c = new Customer("John"); This line will cause a compilation error
        System.out.println(c.getName());
    }
}
