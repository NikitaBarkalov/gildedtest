package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int updateQuality(){
        if (this.sellIn > 0) {
            return QualityValidator.validationNotNegativeQuality(--this.quality);
        }
        return QualityValidator.validationNotNegativeQuality(this.quality - 2);
    }
    public int updateSellIn() {
        return --this.sellIn;
    }

    public void updateParameters() {
        this.quality = updateQuality();
        this.sellIn = updateSellIn();
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
