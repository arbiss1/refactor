package com.gildedrose.service;

import com.gildedrose.enums.GlidedRoseTypes;
import com.gildedrose.model.Item;

public class ItemService {

    private final DaysService daysService;
    private final QualityService qualityService;

    public ItemService(DaysService daysService, QualityService qualityService) {
        this.daysService = daysService;
        this.qualityService = qualityService;
    }

    public void updateItem(Item item) {
        //check if it is legendary item, make no changes if true
        if (!isLegendaryItem(item)) {
            //decrease the day
            daysService.sellByDayValueByOne(item);
            //check after concert
            qualityService.checkIfConcert(item);
            //check if day has passed
            if (daysService.sellByDayValueIsOverZero(item)) {
                qualityService.updateQuality(item);
            }
        } else {
            item.quality = 80;
        }
    }

    public boolean isLegendaryItem(Item item) {
        return item.name.equals(GlidedRoseTypes.SULFURAS.value);
    }
}
