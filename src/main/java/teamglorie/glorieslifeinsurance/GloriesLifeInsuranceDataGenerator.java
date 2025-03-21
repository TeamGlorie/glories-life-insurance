package teamglorie.glorieslifeinsurance;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import teamglorie.glorieslifeinsurance.datagen.*;

public class GloriesLifeInsuranceDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModBlockLootTablesProvider::new);
		pack.addProvider(ModChineseProvider::new);
		pack.addProvider(ModDefaultLanguageProvider::new);
	}
}
