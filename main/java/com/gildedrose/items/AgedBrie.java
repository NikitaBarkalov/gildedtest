package com.gildedrose.items;

import com.gildedrose.additionalFeatures.QualityValidator;

public class AgedBrie extends Item{
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }
    @Override
    public int updateQuality() {
        if (this.sellIn > 0){
            return QualityValidator.validateNotMoreThan50Quality(++this.quality);
        }
        return QualityValidator.validateNotMoreThan50Quality(this.quality + 2);
    }
}
