package com.gildedrose;

public class AgedBrie extends Item{
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }
    @Override
    public int updateQuality() {
        if (this.sellIn > 0){
            return QualityValidator.validationNotMoreThan50Quality(++this.quality);
        }
        return QualityValidator.validationNotMoreThan50Quality(this.quality + 2);
    }
}
