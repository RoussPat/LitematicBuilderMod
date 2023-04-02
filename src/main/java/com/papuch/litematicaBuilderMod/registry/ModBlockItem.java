package com.papuch.litematicaBuilderMod.registry;

import com.papuch.litematicaBuilderMod.LitematicaBuilderMod;
import com.papuch.litematicaBuilderMod.blockEntity.ActiveProviderChestBlockEntity;
import com.papuch.litematicaBuilderMod.blockItem.blockItem.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockItem {


    public static final BlockItem pasiveProviderChestBlockItem = new PassiveProviderChestBlockItem(ModBlocks.passiveProviderChestBlock, new Item.Settings().group(LitematicaBuilderMod.itemGroup));
    public static final BlockItem activeProviderChestBlockItem = new ActiveProviderChestBlockEntity(ModBlocks.activeProviderChestBlock, new Item.Settings().group(LitematicaBuilderMod.itemGroup));
    public static final BlockItem storageChestBlockItem = new StorageChestBlockItem(ModBlocks.storageChestBlock, new Item.Settings().group(LitematicaBuilderMod.itemGroup));
    public static final BlockItem requesterChestBlockItem = new RequesterChestBlockItem(ModBlocks.requesterChestBlock, new Item.Settings().group(LitematicaBuilderMod.itemGroup));
    public static final BlockItem bufferChestBlockItem = new BufferChestBlockItem(ModBlocks.bufferChestBlock, new Item.Settings().group(LitematicaBuilderMod.itemGroup));

    public static void registerBlockItems() {
        FabricDefaultAttributeRegistry.register(pasiveProviderChestBlockItem.BLOCK,);

        Registry.register(Registry.ITEM, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), pasiveProviderChestBlockItem);
        Registry.register(Registry.ITEM, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), activeProviderChestBlockItem);
        Registry.register(Registry.ITEM, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), storageChestBlockItem);
        Registry.register(Registry.ITEM, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), requesterChestBlockItem);
        Registry.register(Registry.ITEM, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), bufferChestBlockItem);
    }
}
