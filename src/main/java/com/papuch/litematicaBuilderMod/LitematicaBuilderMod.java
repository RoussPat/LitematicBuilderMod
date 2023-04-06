package com.papuch.litematicaBuilderMod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LitematicaBuilderMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.

    public static final String modId = "litematicbuildermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(modId);

    public static final ItemGroup itemGroup = FabricItemGroup.builder(new Identifier("litematicaBuilderMod", "Chests")).icon(() -> new ItemStack(Items.CHEST_MINECART)).build();

    static {

    }

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello from litematicBuilderMod!");

        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(Items.CHEST_MINECART);
        });

    }
}
