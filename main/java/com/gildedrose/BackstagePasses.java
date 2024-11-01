package com.gildedrose;

public class BackstagePasses extends Item implements IUpdaterParameters {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        if (this.sellIn > 5 && this.sellIn <= 10) {
            return this.quality + 2;
        } else if (this.sellIn >= 0 && this.sellIn <= 5) {
            return this.quality + 3;
        } else if (this.sellIn < 0) {
            return 0;
        }    
        return ++this.quality;
    }

    @Override
    public int updateSellIn() {
        return --this.sellIn;
    }

    public void updateParameters() {
        this.quality = updateQuality();
        this.sellIn = updateSellIn();
    }
}
