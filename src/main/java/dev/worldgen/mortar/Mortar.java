package dev.worldgen.mortar;

import dev.worldgen.mortar.block.MortarBlocks;
import dev.worldgen.mortar.config.ConfigHandler;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mortar implements ModInitializer {
	public static final String MOD_ID = "mortar";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ConfigHandler.load();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addBefore(Blocks.BRICKS, Blocks.CALCITE));
		MortarBlocks.register();
	}
}