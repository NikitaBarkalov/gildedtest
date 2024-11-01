package com.gildedrose;

public class ConjuredManaCake extends Item implements IUpdaterParameters{

    public ConjuredManaCake(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }   

    @Override
    public int updateQuality() {
        if (this.sellIn > 0){
            return QualityValidator.isQualityNotNegative(this.quality - 2);
        }
        return QualityValidator.isQualityNotNegative(this.quality - 4);
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
