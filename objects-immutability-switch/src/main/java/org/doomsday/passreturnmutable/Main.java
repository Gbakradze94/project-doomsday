package org.doomsday.passreturnmutable;

import org.doomsday.passreturnmutable.Point;

/**
 * Write a program that passes and returns a mutable
 * object to/from an immutable class
 */
public class Main {
    public static void main(String[] args) {
        Radius radius = new Radius();
        radius.setStart(0);
        radius.setEnd(120);

        Point p = new Point(1.23, 4.12, radius);

        System.out.println("Radius start: " + p.getRadius().getStart());
        radius.setStart(5);
        p.getRadius().setStart(5);
        System.out.println("Radius start: " + p.getRadius().getStart());
    }
}
