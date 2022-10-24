package com.gildedrose.service;

import com.gildedrose.enums.GlidedRoseTypes;
import com.gildedrose.model.Item;

public class QualityService {

    private final int QUALITY_MAX_LEGENDARY_ITEM_VALUE = 80;
    private final int QUALITY_MAX_NORMAL_ITEM_VALUE = 50;

    public void updateQuality(Item item) {
        //check days and increase quality, only for backstage
        qualityByDays(item);
        if (item.name.equals(GlidedRoseTypes.BRIE.value)
            || item.name.equals(GlidedRoseTypes.BACKSTAGE_ITEM.value)) {
            item.quality += 2;
        } else {
            //this includes conjured items
            item.quality -= 2;
        }
    }

    public int returnQualityValue(Item item) {
        if (item.name.equals(GlidedRoseTypes.SULFURAS.value)) {
            return QUALITY_MAX_LEGENDARY_ITEM_VALUE;
        }
        return QUALITY_MAX_NORMAL_ITEM_VALUE;
    }

    public void qualityByDays(Item item) {
        if (checkIfItemIsBackstage(item)) {
            if (item.sellIn < 10) {
                increaseQuality(2, item);
            } else if (item.sellIn < 5) {
                increaseQuality(3, item);
            } else if(item.sellIn == 0){
                item.quality = 0;
            }
        }
    }

    public void increaseQuality(int quality, Item item) {
        item.quality += quality;
    }

    public boolean checkIfItemIsBackstage(Item item){
        return item.name.equals(GlidedRoseTypes.BACKSTAGE_ITEM.value);
    }
}
