package com.gildedrose;

public class BackstagePasses extends Item{
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        if (this.sellIn > 5 && this.sellIn <= 10) {
            return QualityValidator.validationNotMoreThan50Quality(this.quality + 2);
        } else if (this.sellIn >= 0 && this.sellIn <= 5) {
            return QualityValidator.validationNotMoreThan50Quality(this.quality + 3);
        } else if (this.sellIn < 0) {
            return 0;
        }    
        return QualityValidator.validationNotMoreThan50Quality(++this.quality);
    }
}
