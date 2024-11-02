package com.gildedrose.items;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn) {
        super("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    @Override
    public int updateQuality() {
        // do nothing because Sulfuras is a legendary item
        return quality;
    }

    @Override
    public int updateSellIn() {
        // do nothing because Sulfuras is a legendary item
        return sellIn;
    }

    @Override
    public void updateParameters() {
        // do nothing because Sulfuras is a legendary item
    }
}
