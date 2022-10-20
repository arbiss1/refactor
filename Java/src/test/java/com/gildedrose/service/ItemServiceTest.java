package com.gildedrose.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.gildedrose.model.Item;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ItemServiceTest {
    /**
     * Method under test: {@link ItemService#ItemService(DaysService, QualityService)}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ItemService.daysService
        //     ItemService.qualityService

        DaysService daysService = new DaysService();
        new ItemService(daysService, new QualityService());

    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    void testUpdateItem() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        Item item = new Item("Name", 1, 1);

        itemService.updateItem(item);
        assertEquals(0, item.sellIn);
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateItem2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gildedrose.service.DaysService.sellByDayValueByOne(com.gildedrose.model.Item)" because "this.daysService" is null
        //       at com.gildedrose.service.ItemService.updateItem(ItemService.java:20)
        //   In order to prevent updateItem(Item)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateItem(Item).
        //   See https://diff.blue/R013 to resolve this issue.

        ItemService itemService = new ItemService(null, new QualityService());
        itemService.updateItem(new Item("Name", 1, 1));
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    void testUpdateItem3() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 1);

        itemService.updateItem(item);
        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        assertEquals(1, item.sellIn);
        assertEquals(1, item.quality);
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    void testUpdateItem4() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        Item item = new Item("Name", 6, 1);

        itemService.updateItem(item);
        assertEquals(5, item.sellIn);
        assertEquals(1, item.quality);
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    void testUpdateItem5() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        Item item = new Item("Name", Integer.MIN_VALUE, 1);

        itemService.updateItem(item);
        assertEquals(Integer.MAX_VALUE, item.sellIn);
        assertEquals(-1, item.quality);
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateItem6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "name" because "item" is null
        //       at com.gildedrose.service.ItemService.isLegendaryItem(ItemService.java:29)
        //       at com.gildedrose.service.ItemService.updateItem(ItemService.java:18)
        //   In order to prevent updateItem(Item)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateItem(Item).
        //   See https://diff.blue/R013 to resolve this issue.

        DaysService daysService = new DaysService();
        (new ItemService(daysService, new QualityService())).updateItem(null);
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateItem7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.gildedrose.service.QualityService.updateQuality(com.gildedrose.model.Item)" because "this.qualityService" is null
        //       at com.gildedrose.service.ItemService.updateItem(ItemService.java:23)
        //   In order to prevent updateItem(Item)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateItem(Item).
        //   See https://diff.blue/R013 to resolve this issue.

        ItemService itemService = new ItemService(new DaysService(), null);
        itemService.updateItem(new Item("Name", 6, 1));
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    void testUpdateItem8() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        Item item = new Item("Aged Brie", 6, 1);

        itemService.updateItem(item);
        assertEquals(5, item.sellIn);
        assertEquals(5, item.quality);
    }

    /**
     * Method under test: {@link ItemService#updateItem(Item)}
     */
    @Test
    void testUpdateItem9() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        Item item = new Item("Concret", 6, 1);

        itemService.updateItem(item);
        assertEquals(5, item.sellIn);
        assertEquals(5, item.quality);
    }

    /**
     * Method under test: {@link ItemService#isLegendaryItem(Item)}
     */
    @Test
    void testIsLegendaryItem() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        assertFalse(itemService.isLegendaryItem(new Item("Name", 1, 1)));
    }

    /**
     * Method under test: {@link ItemService#isLegendaryItem(Item)}
     */
    @Test
    void testIsLegendaryItem2() {
        DaysService daysService = new DaysService();
        ItemService itemService = new ItemService(daysService, new QualityService());
        assertTrue(itemService.isLegendaryItem(new Item("Sulfuras, Hand of Ragnaros", 1, 1)));
    }

    /**
     * Method under test: {@link ItemService#isLegendaryItem(Item)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsLegendaryItem3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "name" because "item" is null
        //       at com.gildedrose.service.ItemService.isLegendaryItem(ItemService.java:29)
        //   In order to prevent isLegendaryItem(Item)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   isLegendaryItem(Item).
        //   See https://diff.blue/R013 to resolve this issue.

        DaysService daysService = new DaysService();
        (new ItemService(daysService, new QualityService())).isLegendaryItem(null);
    }
}

