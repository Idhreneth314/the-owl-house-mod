package net.fabricmc.toh.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.toh.toh;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
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

    public static final Item DEMON_MEAT = registerItem("demon_meat",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.2f).meat().build())));

    public static final Item COOKED_DEMON_MEAT = registerItem("cooked_demon_meat",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).meat().build())));
    public static final Item GOREBERRY = registerItem("goreberry",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 0.1f).build())));
    public static final Item POTATOE = registerItem("potatoe",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build())));
    public static final Item CRABAPPLE = registerItem("crabapple",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item HEX_MIX = registerItem("hex_mix",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
    public static final Item WITCHS_WOOL_HOOD = registerItem("witchs_wool_hood",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item WITCHS_WOOL_CLOAK = registerItem("witchs_wool_cloak",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item WITCHS_WOOL_LEGGINGS = registerItem("witchs_wool_leggings",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item WITCHS_WOOL_BOOTS = registerItem("witchs_wool_boots",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, EquipmentSlot.FEET, new Item.Settings()));
    public static final Item COVEN_GUARD_MASK = registerItem("coven_guard_mask",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item COVEN_GUARD_CLOAK = registerItem("coven_guard_cloak",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item COVEN_GUARD_LEGGINGS = registerItem("coven_guard_leggings",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item COVEN_GUARD_BOOTS = registerItem("coven_guard_boots",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, EquipmentSlot.FEET, new Item.Settings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(toh.MOD_ID, name), item);
    }

    public static void addItemsToItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.DEMON_REALM_MISC).register(entries -> entries.add(ModItems.RAW_SILVER));
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.RAW_SILVER);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.SILVER_INGOT);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.FOOLS_BLOOD_SHARD);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.WRINKLING_ACORN);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.PALISTROM_SAP);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.DEMON_MEAT);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.COOKED_DEMON_MEAT);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.GOREBERRY);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.POTATOE);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.CRABAPPLE);
        addToItemGroup(ModItemGroup.DEMON_REALM_MISC, ModItems.HEX_MIX);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
    }


    public static void registerModItems() {
        toh.LOGGER.debug("Registering items for " + toh.MOD_ID);
        addItemsToItemGroups();
    }
}
