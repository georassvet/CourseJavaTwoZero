package ru.fishbalka.ex4_2.interfaces;

public abstract class Gift {
    public String name;
    private double weight;
    private double cost;

    public abstract String getName();
    public abstract double getWeight();
    public abstract double getCost();
}
