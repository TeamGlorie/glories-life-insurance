package teamglorie.glorieslifeinsurance.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;

public class ModItems {
    public static final Item RAW_TITANIUM = registerItem("metalore/raw_titanium", new Item(new Item.Settings()));
    public static final Item TITANIUM_INGOT = registerItem("metalingot/titanium_ingot", new Item(new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GloriesLifeInsurance.MOD_ID, id), item);
    }

    public static void registerItems() {

    }

}
