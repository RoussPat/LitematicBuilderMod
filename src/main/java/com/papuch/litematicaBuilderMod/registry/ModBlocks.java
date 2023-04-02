package com.papuch.litematicaBuilderMod.registry;

import com.papuch.litematicaBuilderMod.LitematicaBuilderMod;
import com.papuch.litematicaBuilderMod.block.ActiveProviderChestBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block passiveProviderChestBlock = new PassiveProviderChestBlock(FabricBlockSettings.of(Material.WOOD).hardness(5.0f));
    public static final Block activeProviderChestBlock = new ActiveProviderChestBlock(FabricBlockSettings.of(Material.WOOD).hardness(5.0f));
    public static final Block storageChestBlock = new Block(FabricBlockSettings.of(Material.WOOD).hardness(5.0f));
    public static final Block requesterChestBlock = new Block(FabricBlockSettings.of(Material.WOOD).hardness(5.0f));
    public static final Block bufferChestBlock = new Block(FabricBlockSettings.of(Material.WOOD).hardness(5.0f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), passiveProviderChestBlock);
        Registry.register(Registry.BLOCK, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), activeProviderChestBlock);
        Registry.register(Registry.BLOCK, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), storageChestBlock);
        Registry.register(Registry.BLOCK, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), requesterChestBlock);
        Registry.register(Registry.BLOCK, new Identifier(LitematicaBuilderMod.modId, "provider_chest_block"), bufferChestBlock);
    }

}
