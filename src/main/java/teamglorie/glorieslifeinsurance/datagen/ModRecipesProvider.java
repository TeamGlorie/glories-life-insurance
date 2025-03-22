package teamglorie.glorieslifeinsurance.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;
import teamglorie.glorieslifeinsurance.block.ModBlocks;
import teamglorie.glorieslifeinsurance.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {

    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> TITANIUM_INGOT = List.of(ModItems.TITANIUM_ALLOY_DUST);

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerReversibleCompactingRecipes(consumer,
                RecipeCategory.MISC,
                ModItems.RAW_TITANIUM,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RAW_TITANIUM_BLOCK);

        offerReversibleCompactingRecipes(consumer,
                RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.TITANIUM_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_ALLOY_DUST, 2)
                .input(ModItems.RAW_TITANIUM)
                .input(Items.IRON_INGOT)
                .criterion(hasItem(ModItems.RAW_TITANIUM),
                        conditionsFromItem(ModItems.RAW_TITANIUM))
                .offerTo(consumer, new Identifier(GloriesLifeInsurance.MOD_ID, "titanium_alloy_dust"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_HOE, 1)
                .input('#', ModItems.TITANIUM_INGOT)
                .input('|', Items.STICK)
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(consumer, new Identifier(GloriesLifeInsurance.MOD_ID, "titanium_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_SWORD, 1)
                .input('#', ModItems.TITANIUM_INGOT)
                .input('|', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(consumer, new Identifier(GloriesLifeInsurance.MOD_ID, "titanium_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_PICKAXE, 1)
                .input('#', ModItems.TITANIUM_INGOT)
                .input('|', Items.STICK)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(consumer, new Identifier(GloriesLifeInsurance.MOD_ID, "titanium_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_AXE, 1)
                .input('#', ModItems.TITANIUM_INGOT)
                .input('|', Items.STICK)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(consumer, new Identifier(GloriesLifeInsurance.MOD_ID, "titanium_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_SHOVEL, 1)
                .input('#', ModItems.TITANIUM_INGOT)
                .input('|', Items.STICK)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(consumer, new Identifier(GloriesLifeInsurance.MOD_ID, "titanium_shovel"));

        offerSmelting(consumer,
                TITANIUM_INGOT,
                RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT,
                0.7f,
                200,
                "titanium_ingot");

        offerBlasting(consumer,
                TITANIUM_INGOT,
                RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT,
                0.7f,
                100,
                "titanium_ingot");
    }
}
