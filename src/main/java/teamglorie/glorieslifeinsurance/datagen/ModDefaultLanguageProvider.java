package teamglorie.glorieslifeinsurance.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import teamglorie.glorieslifeinsurance.block.ModBlocks;
import teamglorie.glorieslifeinsurance.item.ModItemGroups;
import teamglorie.glorieslifeinsurance.item.ModItems;

public class ModDefaultLanguageProvider extends FabricLanguageProvider {

    public ModDefaultLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.GLORIES_GROUP, "Glorie's Life Insurance");

        translationBuilder.add(ModItems.RAW_TITANIUM, "Raw Titanium");
        translationBuilder.add(ModItems.TITANIUM_INGOT, "Titanium Ingot");
        translationBuilder.add(ModItems.TITANIUM_ALLOY_DUST, "Titanium Alloy Dust");

        translationBuilder.add(ModBlocks.TITANIUM_BLOCK, "Titanium Block");
        translationBuilder.add(ModBlocks.RAW_TITANIUM_BLOCK, "Raw Titanium Block");
        translationBuilder.add(ModBlocks.TITANIUM_ORE, "Titanium Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TITANIUM_ORE, "Deepslate Titanium Ore");

        translationBuilder.add(ModItems.TITANIUM_AXE, "Titanium Axe");
        translationBuilder.add(ModItems.TITANIUM_SWORD, "Titanium Sword");
        translationBuilder.add(ModItems.TITANIUM_PICKAXE, "Titanium Pickaxe");
        translationBuilder.add(ModItems.TITANIUM_SHOVEL, "Titanium Shovel");
        translationBuilder.add(ModItems.TITANIUM_HOE, "Titanium Hoe");
    }
}
