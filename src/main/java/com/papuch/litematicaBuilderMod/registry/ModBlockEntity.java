package com.papuch.litematicaBuilderMod.registry;

import com.papuch.litematicaBuilderMod.LitematicaBuilderMod;
import com.papuch.litematicaBuilderMod.blockEntity.ActiveProviderChestBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registry;

public class ModBlockEntity {



    public static final BlockEntityType<ActiveProviderChestBlockEntity> activeProviderChestBlockEntityType; = Registry.register(Registry.BLOCK_ENTITY_TPYE, new Identifier(LitematicaBuilderMod.modId , "active_provider_chest_block_entity"), FabricBlockEntityTypeBuilder.create(ActiveProviderChestBlockEntity::new, BOX_BLOCK).build(null));
}
