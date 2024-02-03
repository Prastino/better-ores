package net.betterores;

		import net.betterores.block.ModBlock;
		import net.betterores.block.ModBlocks;
		import net.betterores.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterOres implements ModInitializer {
	public static final String MOD_ID = "betterores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);





	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}