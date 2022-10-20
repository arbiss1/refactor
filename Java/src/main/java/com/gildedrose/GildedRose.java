package com.gildedrose;

import com.gildedrose.model.Item;
import com.gildedrose.service.ItemService;
import com.gildedrose.service.QualityService;

public class GildedRose {

    private final int QUALITY_MIN_VALUE = 0;
    private final ItemService itemService;
    private final QualityService qualityService;
    Item[] items;

    public GildedRose(Item[] items, ItemService itemService, QualityService qualityService) {
        this.items = items;
        this.itemService = itemService;
        this.qualityService = qualityService;
    }

    public void updateQuality() {
        for (Item item : items) {
            //update incoming item
            itemService.updateItem(item);
            //check if is negative since it must not be
            if (isItTheLowest(item)) {
                item.quality = QUALITY_MIN_VALUE;
            } else if (isItTheHighest(item)) {
                item.quality = qualityService.returnQualityValue(item);
            }
        }
    }

    private boolean isItTheLowest(Item item) {
        return item.quality < QUALITY_MIN_VALUE;
    }

    private boolean isItTheHighest(Item item) {
        return item.quality > qualityService.returnQualityValue(item);
    }
}
