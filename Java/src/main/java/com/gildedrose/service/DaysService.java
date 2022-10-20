package com.gildedrose.service;

import com.gildedrose.model.Item;

public class DaysService {

    public void sellByDayValueByOne(Item item) {
        item.sellIn -= 1;
    }

    public boolean sellByDayValueIsOverZero(Item item) {
        return item.sellIn > 0;
    }
}
