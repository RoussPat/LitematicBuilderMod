package com.papuch.litematicaBuilderMod.gui;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class BlockScreenHandlerFactory implements NamedScreenHandlerFactory {

    private final BlockPos pos;

    public BlockScreenHandlerFactory(BlockPos pos) {
        this.pos = pos;
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText("block.litematicaBuilderMod.activeProviderChestItem");
    }


    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        BlockEntity blockEntity = playerEntity.world.getBlockEntity(pos);
        return new BlockScreenHandler(syncId, playerInventory, blockEntity);
    }
}