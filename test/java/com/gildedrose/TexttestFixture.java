package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new AgedBrie(0, 0), //
                new Item("Elixir of the Mongoose", 1, 1), //
                new Sulfuras(1), //
                new Sulfuras(-1),
                new BackstagePasses(15, 20),
                new BackstagePasses(11, 40),
                new BackstagePasses(2, 40),
                new ConjuredManaCake(3, 6) };

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
