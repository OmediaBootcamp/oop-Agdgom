package dev.omedia.oop.part1;

public class Carpet {
    private final double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return this.cost;
    }
}

