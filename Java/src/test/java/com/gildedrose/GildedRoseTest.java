package com.gildedrose;

import com.gildedrose.utils.GildedRoseUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    public GildedRoseUtils utils = new GildedRoseUtils();

    @Test
    void testConstructor() {
        assertEquals(1, utils.createsNewGildedRose("Name", 1, 1).items.length);
    }

    @Test
    public void testName() {
        GildedRose gildedRose = utils.createsNewGildedRose("Name", 1, 1);

        gildedRose.updateQuality();

        assertEquals("Name", gildedRose.items[0].name);
    }

    @Test
    void testUpdateQuality() {
        GildedRose gildedRose = utils.createsNewGildedRose("Name", 1, 0);
        gildedRose.updateQuality();
        assertEquals(1, gildedRose.items.length);
    }

    @Test
    public void decreasesSellByDayNumberEachTime() {
        GildedRose gildedRose = utils.createsNewGildedRose("standard item", 0, 0);

        gildedRose.updateQuality();

        assertEquals(-1, gildedRose.items[0].sellIn);
    }

    @Test
    public void agedDecreasesSellByDayNumberEachTime() {
        GildedRose gildedRose = utils.createsNewGildedRose("Aged Brie", 0, 0);

        gildedRose.updateQuality();

        assertEquals(-1, gildedRose.items[0].sellIn);
    }

    @Test
    public void backstagePassesItemDecreasesSellByDayNumberEachTime() {
        GildedRose gildedRose = utils.createsNewGildedRose("Backstage passes", 1, 20);

        gildedRose.updateQuality();

        assertEquals(0, gildedRose.items[0].quality);
    }

    @Test
    public void conjuredItemDecreasesSellByDayNumberEachTime() {
        GildedRose gildedRose = utils.createsNewGildedRose("Conjured", 0, 0);

        gildedRose.updateQuality();

        assertEquals(-1, gildedRose.items[0].sellIn);
    }

    @Test
    public void agedIncreasesInQuality() {
        GildedRose gildedRose = utils.createsNewGildedRose("Aged Brie", 2, 0);

        gildedRose.updateQuality();

        assertEquals(2, gildedRose.items[0].quality);
    }

    @Test
    public void agedCantGoMoreThenFifteen() {
        GildedRose gildedRose = utils.createsNewGildedRose("Aged Brie", 2, 49);

        gildedRose.updateQuality();

        assertEquals(50, gildedRose.items[0].quality);
    }


    @Test
    public void dontChangeSulfurasValues() {
        GildedRose gildedRose = utils.createsNewGildedRose("Sulfuras", 1, 49);

        gildedRose.updateQuality();

        assertEquals(80, gildedRose.items[0].quality);
    }
}

