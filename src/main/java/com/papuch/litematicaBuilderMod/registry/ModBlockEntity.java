package com.papuch.litematicaBuilderMod.registry;

import com.papuch.litematicaBuilderMod.blockEntity.ActiveProviderChestBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlockEntity {


    public static final BlockEntityType<ActiveProviderChestBlockEntity> activeProviderChestBlockEntity;


    static {
        activeProviderChestBlockEntity = Registry.register(Registries.BLOCK_ENTITY_TYPE, ModIdentifiers.activeProviderChest, FabricBlockEntityTypeBuilder.create(ActiveProviderChestBlockEntity::new, ModBlock.activeProviderChestBlock).build(null));
    }
}
