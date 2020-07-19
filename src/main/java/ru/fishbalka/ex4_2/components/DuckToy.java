package ru.fishbalka.ex4_2.components;

import ru.fishbalka.ex4_2.interfaces.Gift;
import ru.fishbalka.ex4_2.interfaces.GiftComponent;

import java.time.Duration;

public class DuckToy extends GiftComponent {

    Gift gift;

    public DuckToy(Gift gift){
        this.gift = gift;
        this.name = " c игрушкой \"Кряква\"";
    }

    @Override
    public String getName() {
        return gift.getName() + name;
    }

    // gramm
    @Override
    public double getWeight() {
        return gift.getWeight() + 300;
    }

    // rur
    @Override
    public double getCost() {
        return gift.getCost() + 200;
    }

}
