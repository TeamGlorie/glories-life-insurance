package teamglorie.glorieslifeinsurance.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import teamglorie.glorieslifeinsurance.block.ModBlocks;
import teamglorie.glorieslifeinsurance.item.ModItems;

public class ModBlockLootTablesProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_ORE,MultiDrop(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM, 1.0f, 3.0f));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE,MultiDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM, 1.0f, 3.0f));
    }

    public LootTable.Builder MultiDrop(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
