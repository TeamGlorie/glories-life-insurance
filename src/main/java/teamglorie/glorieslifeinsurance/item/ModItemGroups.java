package teamglorie.glorieslifeinsurance.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> GLORIES_GROUP = register("glories_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GloriesLifeInsurance.MOD_ID, id));
    }

    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                GLORIES_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.glories_group"))
                        .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.RAW_TITANIUM);
                            entries.add(ModItems.TITANIUM_INGOT);
                        }).build());
    }
}
