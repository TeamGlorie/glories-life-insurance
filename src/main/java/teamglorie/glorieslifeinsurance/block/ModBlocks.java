package teamglorie.glorieslifeinsurance.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;

public class ModBlocks {

    public static final Block TITANIUM_BLOCK = register("titanium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block TITANIUM_ORE = register("titanium_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_TITANIUM_ORE = register("deepslate_titanium_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block RAW_TITANIUM_BLOCK = register("raw_titanium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(GloriesLifeInsurance.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(GloriesLifeInsurance.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

    }
}
