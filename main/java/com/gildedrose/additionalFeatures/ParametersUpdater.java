package com.gildedrose.additionalFeatures;

import com.gildedrose.items.Item;

public class ParametersUpdater {
    public Item[] items;

    public ParametersUpdater(Item[] items) {
        this.items = items;
    }

    public void updateAfterDay() {
        for (Item item : items) {
            item.updateParameters();
        }
    }
}
