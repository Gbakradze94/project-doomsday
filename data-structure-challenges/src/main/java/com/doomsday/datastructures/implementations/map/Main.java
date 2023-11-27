package com.doomsday.datastructures.implementations.map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, String> map = new MyMap<>();
        map.put("Giorgi", "Bakradze");
        System.out.println(map.get("Giorgi"));
    }
}
