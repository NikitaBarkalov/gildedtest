package com.gildedrose;

public class ConjuredManaCake extends Item{

    public ConjuredManaCake(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }   

    @Override
    public int updateQuality() {
        if (this.sellIn > 0){
            return QualityValidator.validateNotNegativeQuality(this.quality - 2);
        }
        return QualityValidator.validateNotNegativeQuality(this.quality - 4);
    }    
}
