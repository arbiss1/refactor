package com.gildedrose.fixture;

import com.gildedrose.GildedRose;
import com.gildedrose.utils.GildedRoseUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextFixtureTest {

    public final GildedRoseUtils utils = new GildedRoseUtils();

    //+5 Dexterity Vest
    @Test
    public void DexterityVestTest() {
        GildedRose gildedRose = utils.createsNewGildedRose("+5 Dexterity Vest", 10, 20);

        gildedRose.updateQuality();

        assertEquals(9, gildedRose.items[0].sellIn);
        assertEquals(18, gildedRose.items[0].quality);
    }

    //Aged Brie
    @Test
    public void AgedBrieTest() {
        GildedRose gildedRose = utils.createsNewGildedRose("Aged Brie", 2, 0);

        gildedRose.updateQuality();

        assertEquals(1, gildedRose.items[0].sellIn);
        assertEquals(2, gildedRose.items[0].quality);
    }

    //Elixir of the Mongoose
    @Test
    public void ElixirOfTheMongooseTest() {
        GildedRose gildedRose = utils.createsNewGildedRose("Elixir of the Mongoose", 5, 7);

        gildedRose.updateQuality();

        assertEquals(4, gildedRose.items[0].sellIn);
        assertEquals(5, gildedRose.items[0].quality);
    }

    //Sulfuras, Hand of Ragnaros
    @Test
    public void SulfurasHandOfRagnarosTest() {
        GildedRose gildedRose = utils.createsNewGildedRose("Sulfuras", 0, 80);

        gildedRose.updateQuality();

        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(80, gildedRose.items[0].quality);
    }

    //Sulfuras, Hand of Ragnaros
    @Test
    public void SulfurasHandOfRagnarosV2Test() {
        GildedRose gildedRose = utils.createsNewGildedRose("Sulfuras", -1, 80);

        gildedRose.updateQuality();

        assertEquals(-2, gildedRose.items[0].sellIn);
        assertEquals(80, gildedRose.items[0].quality);
    }

    //Backstage passes to a TAFKAL80ETC concert
    @Test
    public void BackstagePassesToATAFKAL80ETCConcertTest() {
        GildedRose gildedRose = utils.createsNewGildedRose("Backstage passes, concert", 15, 20);

        gildedRose.updateQuality();

        assertEquals(14, gildedRose.items[0].sellIn);
        assertEquals(18, gildedRose.items[0].quality);
    }

    //Backstage passes to a TAFKAL80ETC concert
    @Test
    public void BackstagePassesToATAFKAL80ETCConcertV2Test() {
        GildedRose gildedRose = utils.createsNewGildedRose("Backstage passes, concert", 10, 49);

        gildedRose.updateQuality();

        assertEquals(9, gildedRose.items[0].sellIn);
        assertEquals(47, gildedRose.items[0].quality);
    }

    //Backstage passes to a TAFKAL80ETC concert
    @Test
    public void BackstagePassesToATAFKAL80ETCConcertV3Test() {
        GildedRose gildedRose = utils.createsNewGildedRose("Backstage passes, concert", 5, 49);

        gildedRose.updateQuality();

        assertEquals(4, gildedRose.items[0].sellIn);
        assertEquals(47, gildedRose.items[0].quality);
    }

    //Conjured Mana Cake
    @Test
    public void ConjuredManaCakeTest() {
        GildedRose gildedRose = utils.createsNewGildedRose("Conjured", 3, 6);

        gildedRose.updateQuality();

        assertEquals(2, gildedRose.items[0].sellIn);
        assertEquals(4, gildedRose.items[0].quality);
    }
}
