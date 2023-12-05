package org.example;

public class Main {
    public static void main(String[] args) {
        Melon melon = (Melon) MelonFactory.newInstance(Hemi.class);

        System.out.println(melon);
    }
}
