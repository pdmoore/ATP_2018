package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GildedRoseTest {

    @Test
    public void Example() {
        // Arrange
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);

        // Act
        app.updateQuality();

        // Assert
        assertEquals("fixme", app.items[0].name);
    }

}
