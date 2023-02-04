package net.fabricmc.toh.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.toh.toh;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.DEMON_REALM_MISC)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.DEMON_REALM_MISC)));

    public static final Item FOOLS_BLOOD_SHARD = registerItem("fools_blood_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.DEMON_REALM_MISC)));

    public static final Item WRINKLING_ACORN = registerItem("wrinkling_acorn",
            new Item(new FabricItemSettings().group(ModItemGroup.DEMON_REALM_MISC)));

    public static final Item PALISTROM_SAP = registerItem("palistrom_sap",
            new Item(new FabricItemSettings().group(ModItemGroup.DEMON_REALM_MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(toh.MOD_ID, name), item);
    }

    public static void registerModItems() {
        toh.LOGGER.debug("Registering items for " + toh.MOD_ID);
    }
}
