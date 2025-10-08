package org.gbakradze;

public class A {

    public static final String a = "abc";

    public static int i = 0;

    static {

        i = Integer.parseInt(a);

    }

}
