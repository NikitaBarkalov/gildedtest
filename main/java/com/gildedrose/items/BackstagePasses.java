package com.gildedrose.items;

import com.gildedrose.additionalFeatures.*;

public class BackstagePasses extends Item {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public int updateQuality() {
        quality = updateQualityForSellInBetween5And10();
        quality = updateQualityForSellInBetween0And5();
        quality = updateQualityForSellInLessThan0();
        quality = updateQualityForSellInMoreThan10();
        return quality;
    }

    private int updateQualityForSellInBetween5And10() {
        if (sellIn > 5 && sellIn <= 10) {
            return QualityValidator.validateNotMoreThan50Quality(quality + 2);
        }
        return quality;
    }

    private int updateQualityForSellInBetween0And5() {
        if (sellIn > 0 && sellIn <= 5) {
            return QualityValidator.validateNotMoreThan50Quality(this.quality + 3);
        }
        return quality;
    }

    private int updateQualityForSellInLessThan0() {
        if (sellIn <= 0) {
            return 0;
        }
        return quality;
    }

    private int updateQualityForSellInMoreThan10() {
        if (sellIn > 10) {
            return QualityValidator.validateNotMoreThan50Quality(++quality);
        }
        return quality;
    }
}
