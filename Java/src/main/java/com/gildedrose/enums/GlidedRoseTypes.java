package com.gildedrose.enums;

public enum GlidedRoseTypes {
    SULFURAS("Sulfuras"),
    BRIE("Aged Brie"),
    CONJURED_ITEM("Conjured"),
    BACKSTAGE_ITEM("Backstage passes");

    public final String value;

    GlidedRoseTypes(String value) {
        this.value = value;
    }
}
