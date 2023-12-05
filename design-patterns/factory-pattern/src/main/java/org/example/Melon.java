package org.example;

public class Melon implements Fruit {
    private final String type;
    private final int weight;
    private final String color;

    public Melon(String type, int weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
