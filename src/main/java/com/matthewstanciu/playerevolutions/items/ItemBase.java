package com.matthewstanciu.playerevolutions.items;

import com.matthewstanciu.playerevolutions.PlayerEvolutions;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(PlayerEvolutions.TAB));
    }
}
