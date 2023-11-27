package org.doomsday.immutable;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.1, 3.0);

        System.out.println(point.hashCode());

        point = new Point(1.0, 3.2);
        System.out.println(point.hashCode());
    }
}
