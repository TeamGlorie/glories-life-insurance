package teamglorie.glorieslifeinsurance.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import teamglorie.glorieslifeinsurance.GloriesLifeInsurance;

public class ModItems {

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new Item.Settings()));

    public static final Item TITANIUM_ALLOY_DUST = registerItem("titanium_alloy_dust",
            new Item(new Item.Settings()));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new Item.Settings()));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM,
                    1,
                    -2.8F,
                    new Item.Settings()));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM,
                    1.5F,
                    -3.0F,
                    new Item.Settings()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM,
                    3,
                    -2.4F,
                    new Item.Settings()));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM,
                    5.0F,
                    -3.0F,
                    new Item.Settings()));

    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterials.TITANIUM,
                    -3,
                    0.0F,
                    new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(GloriesLifeInsurance.MOD_ID, id),
                item);
    }

    public static void registerItems() {

    }

}
