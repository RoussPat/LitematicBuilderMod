package com.papuch.litematicaBuilderMod;

import com.papuch.litematicaBuilderMod.gui.LogisticsChestScreen;
import com.papuch.litematicaBuilderMod.registry.ModGui;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class LitematicaBuilderModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModGui.logisticsChestScreenHandler, LogisticsChestScreen::new);
    }
}
