package teamglorie.glorieslifeinsurance.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import teamglorie.glorieslifeinsurance.block.ModBlocks;
import teamglorie.glorieslifeinsurance.item.ModItemGroups;
import teamglorie.glorieslifeinsurance.item.ModItems;

public class ModChineseProvider extends FabricLanguageProvider {

    public ModChineseProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.GLORIES_GROUP, "Glorie的人寿保险");

        translationBuilder.add(ModItems.RAW_TITANIUM, "粗钛");
        translationBuilder.add(ModItems.TITANIUM_INGOT, "钛锭");
        translationBuilder.add(ModItems.TITANIUM_ALLOY_DUST, "钛合金粉末");

        translationBuilder.add(ModBlocks.TITANIUM_BLOCK, "钛块");
        translationBuilder.add(ModBlocks.RAW_TITANIUM_BLOCK, "粗钛块");
        translationBuilder.add(ModBlocks.TITANIUM_ORE, "钛矿石");
        translationBuilder.add(ModBlocks.DEEPSLATE_TITANIUM_ORE, "深层钛矿石");

        translationBuilder.add(ModItems.TITANIUM_AXE, "钛斧");
        translationBuilder.add(ModItems.TITANIUM_SWORD, "钛剑");
        translationBuilder.add(ModItems.TITANIUM_PICKAXE, "钛镐");
        translationBuilder.add(ModItems.TITANIUM_SHOVEL, "钛锹");
        translationBuilder.add(ModItems.TITANIUM_HOE, "钛锄");
    }
}
