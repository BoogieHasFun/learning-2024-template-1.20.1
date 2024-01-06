package net.boogiehasfun.learning2024;

import net.boogiehasfun.learning2024.block.ModBlocks;
import net.boogiehasfun.learning2024.item.ModItemGroups;
import net.boogiehasfun.learning2024.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Learning2024 implements ModInitializer {
	public static final String MOD_ID = "learning-2024";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
