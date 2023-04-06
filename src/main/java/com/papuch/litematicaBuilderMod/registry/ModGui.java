package com.papuch.litematicaBuilderMod.registry;


import com.papuch.litematicaBuilderMod.gui.LogisticsChestScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;

public class ModGui {
    public static final ScreenHandlerType<LogisticsChestScreenHandler> logisticsChestScreenHandler;

    static {
        logisticsChestScreenHandler = ScreenHandlerRegistry.registerSimple(ModIdentifiers.activeProviderChest, LogisticsChestScreenHandler::new);
    }

}