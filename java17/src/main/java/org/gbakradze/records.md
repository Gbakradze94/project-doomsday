# Records
Records were initially introduced in Java 14 as a preview feature. Record is
a restricted form of class that is intended for "plain data carriers", classes that
contain data not meant to be altered and only the most fundamental methods,
constructors and accessors.


### Record Class
A record class declaration consists of a name, optional type parameters (generic
record declarations are supported), a header, which lists the "components" of the record,
and a body.

For example, here is a record class with two fields:

```java
public record Product(String name, BigDecimal cost, String type) {
}
```
The concise declaraton of Product is equivalent to the following normal class:

```java
public final class Product {
    private final String name;
    private final BigDecimal cost;
    private final String type;
    public Product(String name, BigDecimal cost, String type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }
    public String name() { return name; }
    public BigDecimal cost() { return cost; }
    public String type() { return type; }
    public boolean equals(Object o) { /* ... */ }
    public int hashCode() { /* ... */ }
    public String toString() { /* ... */ }
}
```

Record declaration may specify a <b>top level record class</b>, <b> a member 
record class</b>, or a <b>local record class</b>.

A record class is implicitly <b>final</b>. It is permitted to redundantly specify
<i>final</i> modifier for a record class when declaring it.


A record class declares the following members automatically:
* For each component in the header, the following two members:
    * A private final field with the same name and declared type as the record component.
        This field is sometimes referred to as a component field.
    * A public accessor method with the same name and type of the component; 
     in the Rectangle record class example, these methods are Rectangle::length() 
     and Rectangle::width().
* A canonical constructor whose signature is the same as the header.
* Implementations of the equals and hashCode methods, which specify that two record
  classes are equal if they are of the same type and contain equal component values.
* An implementation of the toString method that returns a string representation of all the
record class's components, with their names.

You create a record object with the new keyword, for example:
```java
Product product = new Product("Laptop", new BigDecimal("1200.00"), "Electronics");
```

source: https://docs.oracle.com/en/java/javase/17/language/records.html