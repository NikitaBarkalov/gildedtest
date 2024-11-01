package com.gildedrose;

import com.gildedrose.updaters.GildedRose;

import org.junit.jupiter.api.Test;

import com.gildedrose.items.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateAfterDay();
        assertEquals("foo", app.items[0].name);
    }

}
