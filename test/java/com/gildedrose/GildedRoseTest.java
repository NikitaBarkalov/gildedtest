package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.additionalFeatures.ParametersUpdater;
import com.gildedrose.items.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        ParametersUpdater app = new ParametersUpdater(items);
        app.updateAfterDay();
        assertEquals("foo", app.items[0].name);
    }

}
