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
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item WITCHS_WOOL_CLOAK = registerItem("witchs_wool_cloak",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item WITCHS_WOOL_LEGGINGS = registerItem("witchs_wool_leggings",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item WITCHS_WOOL_BOOTS = registerItem("witchs_wool_boots",
            new ArmorItem(ModArmorMaterials.WITCHS_WOOL, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Item COVEN_GUARD_MASK = registerItem("coven_guard_mask",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item COVEN_GUARD_CLOAK = registerItem("coven_guard_cloak",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item COVEN_GUARD_LEGGINGS = registerItem("coven_guard_leggings",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item COVEN_GUARD_BOOTS = registerItem("coven_guard_boots",
            new ArmorItem(ModArmorMaterials.COVEN_GUARD, ArmorItem.Type.BOOTS, new Item.Settings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(toh.MOD_ID, name), item);
    }



    public static void registerModItems() {
        toh.LOGGER.debug("Registering items for " + toh.MOD_ID);
    }
}
