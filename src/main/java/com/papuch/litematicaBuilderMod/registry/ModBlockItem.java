package com.papuch.litematicaBuilderMod.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlockItem {


    public static final BlockItem activeProviderChestBlockItem;

    static{
        activeProviderChestBlockItem = Registry.register(Registries.ITEM,ModIdentifiers.activeProviderChest,new BlockItem(ModBlock.activeProviderChestBlock,new Item.Settings()));
    }

}
