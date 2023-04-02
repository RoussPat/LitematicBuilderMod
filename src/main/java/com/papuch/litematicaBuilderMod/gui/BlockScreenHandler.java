package com.papuch.litematicaBuilderMod.gui;

import com.papuch.litematicaBuilderMod.registry.ModGui;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;

public class BlockScreenHandler extends ScreenHandler {
    
    public BlockScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity) {
        super(ModGui.MY_SCREEN_HANDLER_TYPE, syncId);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }

    // Add slots and other GUI elements here
}