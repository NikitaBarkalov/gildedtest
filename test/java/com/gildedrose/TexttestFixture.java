package com.gildedrose;

import com.gildedrose.items.*;
import com.gildedrose.updaters.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("+6 Dexterity Vest", 0, 5),
                new Item("+7 Dexterity Vest", 1, 5),
                new Item("+8 Dexterity Vest", 10, 0),
                new Item("+9 Dexterity Vest", 0, 0),
                new AgedBrie(10, 0), //
                new AgedBrie(0, 49),
                new AgedBrie(0, 25),
                new AgedBrie(10, 50),
                new Sulfuras(1), //
                new Sulfuras(-1),
                new BackstagePasses(15, 20),
                new BackstagePasses(15, 50),
                new BackstagePasses(11, 40),
                new BackstagePasses(10, 40),
                new BackstagePasses(10, 49),
                new BackstagePasses(6, 40),
                new BackstagePasses(5, 40),
                new BackstagePasses(5, 48),
                new BackstagePasses(5, 49),
                new BackstagePasses(1, 6),
                new BackstagePasses(0, 50),
                new ConjuredManaCake(10, 10),
                new ConjuredManaCake(10, 1),
                new ConjuredManaCake(1, 10),
                new ConjuredManaCake(0, 10),
                new ConjuredManaCake(0, 2)
             };

        GildedRose app = new GildedRose(items);

        int days = 5;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateAfterDay();
        }
    }

}
