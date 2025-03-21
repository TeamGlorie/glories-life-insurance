package teamglorie.glorieslifeinsurance.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import teamglorie.glorieslifeinsurance.block.ModBlocks;
import teamglorie.glorieslifeinsurance.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {

    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> TITANIUM_INGOT = List.of(ModItems.RAW_TITANIUM, ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE);

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
