package com.gildedrose;

public class QualityValidator {
    public static int validationNotNegativeQuality(int quality){
        if (quality < 0){
            return 0;
        }
        return quality;
    }

    public static int validationNotMoreThan50Quality(int quality){
        if (quality > 50){
            return 50;
        }
        return quality;
    }
}
