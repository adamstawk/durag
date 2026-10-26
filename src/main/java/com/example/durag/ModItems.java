package com.example.durag;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // ArmorItem.Type.HELMET = zakłada się na głowę (prawy klik lub slot hełmu)
    public static final Item DURAG = Registry.register(
            Registries.ITEM,
            Identifier.of(DuragMod.MOD_ID, "durag"),
            new ArmorItem(ModArmorMaterials.DURAG, ArmorItem.Type.HELMET,
                    new Item.Settings().maxCount(1))
    );

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register(entries -> entries.add(DURAG));
    }
}
