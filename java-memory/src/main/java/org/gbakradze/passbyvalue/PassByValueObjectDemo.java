package org.gbakradze.passbyvalue;

public class PassByValueObjectDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Sally");
        renameCustomer(customer);
        System.out.println(customer.getName());
    }

    public static void renameCustomer(Customer customer) {
        customer.setName("Diane");
    }
}
