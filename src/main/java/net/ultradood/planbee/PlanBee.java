package net.ultradood.planbee;

import net.fabricmc.api.ModInitializer;

import net.ultradood.planbee.item.ModItemGroups;
import net.ultradood.planbee.item.ModItems;
import net.ultradood.planbee.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlanBee implements ModInitializer {
	public static final String MOD_ID = "plan_bee";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}