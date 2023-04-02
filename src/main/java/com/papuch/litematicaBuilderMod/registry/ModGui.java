package com.papuch.litematicaBuilderMod.registry;

import com.papuch.litematicaBuilderMod.LitematicaBuilderMod;
import com.papuch.litematicaBuilderMod.gui.BlockScreenHandler;
import com.papuch.litematicaBuilderMod.gui.BlockScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModGui {
    public static final ScreenHandlerType<BlockScreenHandler> passiveProviderChestGui = ScreenHandlerRegistry.registerSimple(new Identifier(LitematicaBuilderMod.modId,"passiveProviderChestGui"), BlockScreenHandlerFactory::new);

    public static  void registerGui(){


    }

}