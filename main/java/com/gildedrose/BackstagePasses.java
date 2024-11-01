package com.gildedrose;

public class BackstagePasses extends Item{
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        this.quality = updateQualityForSellInBetween5And10();
        this.quality = updateQualityForSellInBetween0And5();
        this.quality = updateQualityForSellInLessThan0();
        this.quality = updateQualityForSellInMoreThan10();
        return this.quality;
    }

    private int updateQualityForSellInBetween5And10(){
        if (this.sellIn > 5 && this.sellIn <= 10) {
            return QualityValidator.validateNotMoreThan50Quality(this.quality + 2);
        }
        return this.quality;
    }
    private int updateQualityForSellInBetween0And5(){
        if (this.sellIn > 0 && this.sellIn <= 5) {
            return QualityValidator.validateNotMoreThan50Quality(this.quality + 3);
        }
        return this.quality;
    }
    private int updateQualityForSellInLessThan0(){
        if (this.sellIn <= 0) {
            return 0;
        }
        return this.quality;
    }
    private int updateQualityForSellInMoreThan10(){
        return QualityValidator.validateNotMoreThan50Quality(++this.quality);
    }
}
