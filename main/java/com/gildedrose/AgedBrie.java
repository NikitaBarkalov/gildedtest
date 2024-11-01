package com.gildedrose;

public class AgedBrie extends Item implements IUpdaterParameters {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }
    @Override
    public int updateQuality() {
        if (this.sellIn > 0){
            return ++this.quality;
        }
        return this.quality + 2;
    }

    public int updateSellIn() {
        return --this.sellIn;
    }

    public void updateParameters(){
        this.quality = updateQuality();
        this.sellIn = updateSellIn();
    }

}
