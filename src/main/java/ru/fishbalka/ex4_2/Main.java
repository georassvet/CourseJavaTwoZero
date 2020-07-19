package ru.fishbalka.ex4_2;

import ru.fishbalka.ex4_2.components.Burger;
import ru.fishbalka.ex4_2.components.Cola;
import ru.fishbalka.ex4_2.components.DuckToy;
import ru.fishbalka.ex4_2.components.Sweet;
import ru.fishbalka.ex4_2.gifts.HappyMeal;
import ru.fishbalka.ex4_2.interfaces.Gift;
import ru.fishbalka.ex4_2.gifts.TreeGift;

public class Main {
    public static void main(String[] args) {
        Gift treeGift = new TreeGift();
        treeGift = new DuckToy(treeGift);
        treeGift = new Sweet(treeGift);

        System.out.println(treeGift.getName()
                + ". Вес:" + treeGift.getWeight()
                + "грамм. Стоимость:" + treeGift.getCost() + " руб.");

        Gift happyMeal = new HappyMeal();
        happyMeal = new Cola(happyMeal);
        happyMeal = new Burger(happyMeal);
        happyMeal = new Burger(happyMeal);
        happyMeal = new DuckToy(happyMeal);


        System.out.println(happyMeal.getName()
                + ". Вес:" + happyMeal.getWeight()
                + "грамм. Стоимость:" + happyMeal.getCost()+ " руб.");


    }
}
