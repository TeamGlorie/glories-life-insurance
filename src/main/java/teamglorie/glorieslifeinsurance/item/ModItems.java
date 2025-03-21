package teamglorie.glorieslifeinsurance.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;

public class ModItems {
    public static final Item RAW_TITANIUM = registerItem("metalore/raw_titanium", new Item(new Item.Settings()));
    public static final Item TITANIUM_INGOT = registerItem("metalingot/titanium_ingot", new Item(new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GloriesLifeInsurance.MOD_ID, id), item);
    }
    public static Item register(String id, Item item) {
        return register(new Identifier(id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, key, item);
    }
    public static void registerItems() {

    }

}
