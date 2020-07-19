package ru.fishbalka.ex4_2.components;

import ru.fishbalka.ex4_2.interfaces.Gift;
import ru.fishbalka.ex4_2.interfaces.GiftComponent;

public class Cola extends GiftComponent {

    Gift gift;
    public Cola(Gift gift){
        this.gift = gift;
    }

    @Override
    public String getName() {
        return gift.getName() + " c колой";
    }

    @Override
    public double getWeight() {
        return gift.getWeight() + 500;
    }

    @Override
    public double getCost() {
        return gift.getCost() + 80;
    }
}
