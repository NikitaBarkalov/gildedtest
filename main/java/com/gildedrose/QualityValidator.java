package com.gildedrose;

public class QualityValidator {
    public static int isQualityNotNegative(int quality){
        if (quality < 0){
            return 0;
        }
        return quality;
    }

    public static int isQualityNotMoreThan50(int quality){
        if (quality > 50){
            return 50;
        }
        return quality;
    }
}
