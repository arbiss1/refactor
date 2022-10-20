package com.gildedrose.utils;

import com.gildedrose.GildedRose;
import com.gildedrose.model.Item;
import com.gildedrose.service.DaysService;
import com.gildedrose.service.ItemService;
import com.gildedrose.service.QualityService;

public class GildedRoseUtils {

    public GildedRose createsNewGildedRose(String name, int sellIn, int quality){
        return new GildedRose(
            new Item[]{new Item(name, sellIn, quality)},
            new ItemService(new DaysService(), new QualityService()),
            new QualityService()
        );
    }
}
