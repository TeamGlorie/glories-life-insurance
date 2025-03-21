package teamglorie.glorieslifeinsurance;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import teamglorie.glorieslifeinsurance.block.ModBlocks;
import teamglorie.glorieslifeinsurance.item.ModItemGroups;
import teamglorie.glorieslifeinsurance.item.ModItems;

public class GloriesLifeInsurance implements ModInitializer {

	public static final String MOD_ID = "glories-life-insurance";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerGroups();
		LOGGER.info("Glorie's Life Insurance ON");
	}
}