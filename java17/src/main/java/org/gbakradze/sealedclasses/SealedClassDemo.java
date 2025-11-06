package org.gbakradze.sealedclasses;

import java.util.Arrays;

public class SealedClassDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Class shapeClass = shape.getClass();
        System.out.println("Is the class sealed? :  " + shapeClass.isSealed());
        System.out.println("Permitted Subclasses " + Arrays.toString(shapeClass.getPermittedSubclasses()));
    }
}
