package teamglorie.glorieslifeinsurance.item;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import teamglorie.glorieslifeinsurance.block.ModBlocks;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> GLORIES_GROUP = register();

    private static RegistryKey<ItemGroup> register() {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP,
                new Identifier(GloriesLifeInsurance.MOD_ID, "glories_life_insurance"));
    }

    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                GLORIES_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.glories_life_insurance"))
                        .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.RAW_TITANIUM);
                            entries.add(ModItems.TITANIUM_ALLOY_DUST);
                            entries.add(ModItems.TITANIUM_INGOT);
                            entries.add(ModBlocks.TITANIUM_BLOCK);
                            entries.add(ModBlocks.TITANIUM_ORE);
                            entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                            entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                            entries.add(ModItems.TITANIUM_HOE);
                            entries.add(ModItems.TITANIUM_AXE);
                            entries.add(ModItems.TITANIUM_PICKAXE);
                            entries.add(ModItems.TITANIUM_SHOVEL);
                            entries.add(ModItems.TITANIUM_SWORD);
                        }).build());
    }
}
