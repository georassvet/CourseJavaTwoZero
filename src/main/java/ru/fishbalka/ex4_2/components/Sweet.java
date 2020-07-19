package ru.fishbalka.ex4_2.components;

import ru.fishbalka.ex4_2.interfaces.Gift;
import ru.fishbalka.ex4_2.interfaces.GiftComponent;

public class Sweet extends GiftComponent {

    Gift gift;

    public Sweet(Gift gift) {
        this.gift = gift;
    }

    @Override
    public String getName() {
        return gift.getName()  + " c шоколадкой Аленка" ;
    }

    @Override
    public double getWeight() {
        return gift.getWeight() + 100;
    }

    @Override
    public double getCost() {
        return gift.getCost() + 60;
    }
}
