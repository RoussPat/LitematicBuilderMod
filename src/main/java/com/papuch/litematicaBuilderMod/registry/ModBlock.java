package com.papuch.litematicaBuilderMod.registry;

import com.papuch.litematicaBuilderMod.block.ActiveProviderChestBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlock {

    public static final Block activeProviderChestBlock;

    static {
        activeProviderChestBlock = Registry.register(Registries.BLOCK, ModIdentifiers.activeProviderChest, new ActiveProviderChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
    }



}
