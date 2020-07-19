package ru.fishbalka.ex4_2.gifts;

import ru.fishbalka.ex4_2.interfaces.Gift;

public class TreeGift extends Gift {


    @Override
    public String getName() {
        return "Елочный подарок";
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
