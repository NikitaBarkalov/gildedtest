package com.gildedrose;

public class Sulfuras extends Item{
    public Sulfuras(int sellIn) {
        super("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }
    @Override
    public int updateQuality() {
        // do nothing because Sulfuras is a legendary item
        return this.quality;
    }

    @Override
    public int updateSellIn() {
        // do nothing because Sulfuras is a legendary item
        return this.sellIn;
    }

    @Override
    public void updateParameters(){
        // do nothing because Sulfuras is a legendary item
    }
}
