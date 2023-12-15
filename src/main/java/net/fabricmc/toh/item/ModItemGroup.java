package net.fabricmc.toh.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.toh.block.ModBlocks;
import net.fabricmc.toh.toh;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup BUILDING_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "building_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.building_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.TITANSTONE_BRICKS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BOILING_PINE_LOG);
                        entries.add(ModBlocks.BOILING_PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_BOILING_PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_BOILING_PINE_WOOD);
                        entries.add(ModBlocks.BOILING_PINE_PLANKS);
                        entries.add(ModBlocks.BOILING_PINE_STAIRS);
                        entries.add(ModBlocks.BOILING_PINE_SLAB);
                        entries.add(ModBlocks.BOILING_PINE_FENCE);
                        entries.add(ModBlocks.BOILING_PINE_FENCE_GATE);
                        entries.add(ModBlocks.BOILING_PINE_DOOR);
                        entries.add(ModBlocks.BOILING_PINE_TRAPDOOR);
                        entries.add(ModBlocks.BOILING_PINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BOILING_PINE_BUTTON);

                        entries.add(ModBlocks.WRINKLING_OAK_LOG);
                        entries.add(ModBlocks.WRINKLING_OAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_WRINKLING_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_WRINKLING_OAK_WOOD);
                        entries.add(ModBlocks.WRINKLING_OAK_PLANKS);
                        entries.add(ModBlocks.WRINKLING_OAK_STAIRS);
                        entries.add(ModBlocks.WRINKLING_OAK_SLAB);
                        entries.add(ModBlocks.WRINKLING_OAK_FENCE);
                        entries.add(ModBlocks.WRINKLING_OAK_FENCE_GATE);
                        entries.add(ModBlocks.WRINKLING_OAK_DOOR);
                        entries.add(ModBlocks.WRINKLING_OAK_TRAPDOOR);
                        entries.add(ModBlocks.WRINKLING_OAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.WRINKLING_OAK_BUTTON);

                        entries.add(ModBlocks.PRICKLY_FIR_LOG);
                        entries.add(ModBlocks.PRICKLY_FIR_WOOD);
                        entries.add(ModBlocks.STRIPPED_PRICKLY_FIR_LOG);
                        entries.add(ModBlocks.STRIPPED_PRICKLY_FIR_WOOD);
                        entries.add(ModBlocks.PRICKLY_FIR_PLANKS);
                        entries.add(ModBlocks.PRICKLY_FIR_STAIRS);
                        entries.add(ModBlocks.PRICKLY_FIR_SLAB);
                        entries.add(ModBlocks.PRICKLY_FIR_FENCE);
                        entries.add(ModBlocks.PRICKLY_FIR_FENCE_GATE);
                        entries.add(ModBlocks.PRICKLY_FIR_DOOR);
                        entries.add(ModBlocks.PRICKLY_FIR_TRAPDOOR);
                        entries.add(ModBlocks.PRICKLY_FIR_PRESSURE_PLATE);
                        entries.add(ModBlocks.PRICKLY_FIR_BUTTON);

                        entries.add(ModBlocks.BOGWOOD_CYPRESS_LOG);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_WOOD);
                        entries.add(ModBlocks.STRIPPED_BOGWOOD_CYPRESS_LOG);
                        entries.add(ModBlocks.STRIPPED_BOGWOOD_CYPRESS_WOOD);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_PLANKS);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_STAIRS);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_SLAB);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_FENCE);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_FENCE_GATE);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_DOOR);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_TRAPDOOR);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_PRESSURE_PLATE);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_BUTTON);

                        entries.add(ModBlocks.PALISTROM_LOG);
                        entries.add(ModBlocks.PALISTROM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALISTROM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALISTROM_WOOD);
                        entries.add(ModBlocks.PALISTROM_PLANKS);
                        entries.add(ModBlocks.PALISTROM_STAIRS);
                        entries.add(ModBlocks.PALISTROM_SLAB);
                        entries.add(ModBlocks.PALISTROM_FENCE);
                        entries.add(ModBlocks.PALISTROM_FENCE_GATE);
                        entries.add(ModBlocks.PALISTROM_DOOR);
                        entries.add(ModBlocks.PALISTROM_TRAPDOOR);
                        entries.add(ModBlocks.PALISTROM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALISTROM_BUTTON);

                        entries.add(ModBlocks.TITANSTONE);
                        entries.add(ModBlocks.TITANSTONE_STAIRS);
                        entries.add(ModBlocks.TITANSTONE_SLAB);
                        //entries.add(ModBlocks.TITANSTONE_PRESSURE_PLATE);
                        //entries.add(ModBlocks.TITANSTONE_BUTTON);

                        entries.add(ModBlocks.FRACTURED_TITANSTONE);
                        entries.add(ModBlocks.FRACTURED_TITANSTONE_STAIRS);
                        entries.add(ModBlocks.FRACTURED_TITANSTONE_SLAB);
                        entries.add(ModBlocks.FRACTURED_TITANSTONE_WALL);

                        entries.add(ModBlocks.MOSSY_FRACTURED_TITANSTONE);
                        entries.add(ModBlocks.MOSSY_FRACTURED_TITANSTONE_STAIRS);
                        entries.add(ModBlocks.MOSSY_FRACTURED_TITANSTONE_SLAB);
                        entries.add(ModBlocks.MOSSY_FRACTURED_TITANSTONE_WALL);

                        entries.add(ModBlocks.TITANSTONE_BRICKS);
                        entries.add(ModBlocks.CRACKED_TITANSTONE_BRICKS);
                        entries.add(ModBlocks.TITANSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.TITANSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.TITANSTONE_BRICK_WALL);

                        entries.add(ModBlocks.CHISELED_TITANSTONE);

                        entries.add(ModBlocks.MOSSY_TITANSTONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_TITANSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_TITANSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_TITANSTONE_BRICK_WALL);

                        entries.add(ModBlocks.TITAN_BONE_BLOCK);
                        entries.add(ModBlocks.TITAN_MARROW);
                        entries.add(ModBlocks.TITAN_BONE_BRICKS);
                        entries.add(ModBlocks.TITAN_BONE_BRICK_STAIRS);
                        entries.add(ModBlocks.TITAN_BONE_BRICK_SLAB);
                        entries.add(ModBlocks.TITAN_BONE_BRICK_WALL);

                        entries.add(ModBlocks.SILVER_BLOCK);

                    }).build());

    public static ItemGroup NATURAL_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "natural_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.natural_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.FLESH_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FLESH_BLOCK);
                        entries.add(ModBlocks.FLESH_TENDRILS);
                        entries.add(ModBlocks.EYELIGHT);

                        entries.add(ModBlocks.FOOLS_BLOOD_BLOCK);
                        entries.add(ModBlocks.FOOLS_BLOOD_DRIPSTONE);

                        entries.add(ModBlocks.TITANSTONE);
                        entries.add(ModBlocks.FRACTURED_TITANSTONE);
                        entries.add(ModBlocks.TITAN_MARROW);
                        entries.add(ModBlocks.TITAN_BONE_BLOCK);

                        entries.add(ModBlocks.TITANSTONE_COAL_ORE);
                        entries.add(ModBlocks.TITANSTONE_IRON_ORE);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.TITANSTONE_SILVER_ORE);
                        entries.add(ModBlocks.TITANSTONE_GOLD_ORE);
                        entries.add(ModBlocks.TITANSTONE_REDSTONE_ORE);
                        entries.add(ModBlocks.TITANSTONE_EMERALD_ORE);
                        entries.add(ModBlocks.TITANSTONE_AMETHYST_ORE);
                        entries.add(ModBlocks.TITANSTONE_LAPIS_ORE);
                        entries.add(ModBlocks.TITANSTONE_DIAMOND_ORE);

                        entries.add(ModBlocks.BOILING_PINE_LOG);
                        entries.add(ModBlocks.WRINKLING_OAK_LOG);
                        entries.add(ModBlocks.PRICKLY_FIR_LOG);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_LOG);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_ROOTS);
                        entries.add(ModBlocks.PALISTROM_LOG);

                        entries.add(ModBlocks.BOILING_PINE_LEAVES);
                        entries.add(ModBlocks.WRINKLING_OAK_LEAVES);
                        entries.add(ModBlocks.PRICKLY_FIR_LEAVES);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_LEAVES);
                        entries.add(ModBlocks.PALISTROM_LEAVES);

                        entries.add(ModBlocks.BOILING_PINE_SAPLING);
                        entries.add(ModBlocks.WRINKLING_OAK_SAPLING);
                        entries.add(ModBlocks.PRICKLY_FIR_SAPLING);
                        entries.add(ModBlocks.BOGWOOD_CYPRESS_SAPLING);
                        entries.add(ModBlocks.PALISTROM_SAPLING);

                        entries.add(ModBlocks.NIGHTGRASS);
                        entries.add(ModBlocks.BEACHGRASS);
                        entries.add(ModBlocks.MIDNIGHT_FERN);
                        entries.add(ModBlocks.WOODGRASS);

                        entries.add(ModBlocks.SKY_TULIP);
                        entries.add(ModBlocks.SEA_TULIP);
                        entries.add(ModBlocks.NIGHT_TULIP);
                        entries.add(ModBlocks.PETUNIA);
                        entries.add(ModBlocks.BURNBRISTLE);
                        entries.add(ModBlocks.DEMON_ROSE);
                        entries.add(ModBlocks.GOLDENWOOD);

                        entries.add(ModBlocks.SPINE_SUCCULENT);
                        entries.add(ModBlocks.BALL_CACTUS);
                        entries.add(ModBlocks.BILE_CACTUS);
                        entries.add(ModBlocks.STINGING_CACTUS);
                    }).build());
    public static ItemGroup TOOLS_UTILITIES = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "tools_utilities"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.tools_utilities"))
                    .icon(() -> new ItemStack(Items.IRON_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(Items.IRON_PICKAXE);
                    }).build());
    public static ItemGroup COMBAT = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "combat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.combat"))
                    .icon(() -> new ItemStack(ModItems.COVEN_GUARD_CLOAK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COVEN_GUARD_MASK);
                        entries.add(ModItems.COVEN_GUARD_CLOAK);
                        entries.add(ModItems.COVEN_GUARD_LEGGINGS);
                        entries.add(ModItems.COVEN_GUARD_BOOTS);

                        entries.add(ModItems.WITCHS_WOOL_HOOD);
                        entries.add(ModItems.WITCHS_WOOL_CLOAK);
                        entries.add(ModItems.WITCHS_WOOL_LEGGINGS);
                        entries.add(ModItems.WITCHS_WOOL_BOOTS);
                    }).build());
    public static ItemGroup MAGIC = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "magic"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.magic"))
                    .icon(() -> new ItemStack(ModItems.PALISTROM_SAP)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PALISTROM_SAP);
                        entries.add(ModItems.WITCHS_WOOL_HOOD);
                        entries.add(ModItems.WITCHS_WOOL_CLOAK);
                        entries.add(ModItems.WITCHS_WOOL_LEGGINGS);
                        entries.add(ModItems.WITCHS_WOOL_BOOTS);
                    }).build());
    public static ItemGroup FOOD_DRINKS = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "food_drinks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.food_drinks"))
                    .icon(() -> new ItemStack(ModItems.GOREBERRY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DEMON_MEAT);
                        entries.add(ModItems.COOKED_DEMON_MEAT);
                        entries.add(ModItems.GOREBERRY);
                        entries.add(ModItems.POTATOE);
                        entries.add(ModItems.CRABAPPLE);
                        entries.add(ModItems.HEX_MIX);
                    }).build());
    public static ItemGroup INGREDIENTS = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.ingredients"))
                    .icon(() -> new ItemStack(ModItems.RAW_SILVER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.FOOLS_BLOOD_SHARD);
                        entries.add(ModItems.WRINKLING_ACORN);

                    }).build());
    public static ItemGroup SPAWN_EGGS = Registry.register(Registries.ITEM_GROUP, new Identifier(toh.MOD_ID, "spawn_eggs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.toh.spawn_eggs"))
                    .icon(() -> new ItemStack(SpawnEggItem.forEntity(EntityType.PIG))).entries((displayContext, entries) -> {
                        entries.add(SpawnEggItem.forEntity(EntityType.PIG));

                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.SILVER_INGOT);
            entries.add(ModItems.RAW_SILVER);
        });
    }
}