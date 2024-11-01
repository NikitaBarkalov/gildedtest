package com.gildedrose;

public class CommonItem extends Item implements IUpdaterParameters {

    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public int updateQuality(){
        if (this.sellIn > 0) {
            return QualityValidator.isQualityNotNegative(--this.quality);
        }
        return QualityValidator.isQualityNotNegative(this.quality - 2);
    }

    @Override
    public int updateSellIn() {
        return --this.sellIn;
    }

    public void updateParameters() {
        this.quality = updateQuality();
        this.sellIn =updateSellIn();
    }

}
