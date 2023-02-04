package net.fabricmc.toh.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.toh.toh;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings()));

    public static final Item FOOLS_BLOOD_SHARD = registerItem("fools_blood_shard",
            new Item(new FabricItemSettings()));

    public static final Item WRINKLING_ACORN = registerItem("wrinkling_acorn",
            new Item(new FabricItemSettings()));

    public static final Item PALISTROM_SAP = registerItem("palistrom_sap",
            new Item(new FabricItemSettings()));


    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add (item));
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(toh.MOD_ID, name), item);
    }

    public static void registerModItems() {
        toh.LOGGER.debug("Registering items for " + toh.MOD_ID);
    }

    public static void addItemsToItemGroups() {
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, RAW_SILVER);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, SILVER_INGOT);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, PALISTROM_SAP);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, FOOLS_BLOOD_SHARD);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, WRINKLING_ACORN);

    }
}
