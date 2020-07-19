package ru.fishbalka.ex4_2.components;

import ru.fishbalka.ex4_2.interfaces.Gift;
import ru.fishbalka.ex4_2.interfaces.GiftComponent;

public class Burger extends GiftComponent {

    Gift gift;

    public Burger(Gift gift){
        this.gift = gift;
    }

    @Override
    public String getName() {
        return gift.getName() + " c гамбургером";
    }

    @Override
    public double getWeight() {
        return gift.getWeight() + 250;
    }

    @Override
    public double getCost() {
        return gift.getCost() + 50;
    }
}
