package net.fabricmc.toh.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.toh.item.ModItemGroup;
import net.fabricmc.toh.toh;
import net.fabricmc.toh.world.tree.BoilingPineSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TITANSTONE_SILVER_ORE = registerBlock("titanstone_silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.GOLD_ORE).strength(3.0f).requiresTool()));
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copy(Blocks.GOLD_BLOCK)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block TITANSTONE_GOLD_ORE = registerBlock("titanstone_gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block TITANSTONE_COAL_ORE = registerBlock("titanstone_coal_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_COAL_ORE), UniformIntProvider.create(3, 5)));
    public static final Block TITANSTONE_AMETHYST_ORE = registerBlock("titanstone_amethyst_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK), UniformIntProvider.create(3, 5)));
    public static final Block TITANSTONE_DIAMOND_ORE = registerBlock("titanstone_diamond_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_DIAMOND_ORE), UniformIntProvider.create(3, 5)));
    public static final Block TITANSTONE_EMERALD_ORE = registerBlock("titanstone_emerald_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_EMERALD_ORE), UniformIntProvider.create(3, 5)));
    public static final Block TITANSTONE_LAPIS_ORE = registerBlock("titanstone_lapis_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_LAPIS_ORE), UniformIntProvider.create(3, 5)));
    public static final Block TITANSTONE_IRON_ORE = registerBlock("titanstone_iron_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block TITANSTONE_REDSTONE_ORE = registerBlock("titanstone_redstone_ore", new RedstoneOreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final Block TITANSTONE_COPPER_ORE = registerBlock("titanstone_copper_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_COPPER_ORE)));




    public static final Block BOILING_PINE_LOG = registerBlock("boiling_pine_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block BOILING_PINE_WOOD = registerBlock("boiling_pine_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BOILING_PINE_LOG = registerBlock("stripped_boiling_pine_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BOILING_PINE_WOOD = registerBlock("stripped_boiling_pine_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GLYPH_INSCRIBER = registerBlock("glyph_inscriber", new CraftingTableBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block BOILING_PINE_PLANKS = registerBlock("boiling_pine_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BOILING_PINE_LEAVES = registerBlock("boiling_pine_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block BOILING_PINE_SAPLING = registerBlock("boiling_pine_sapling", new SaplingBlock(new BoilingPineSaplingGenerator(), FabricBlockSettings.copy(Blocks.SPRUCE_SAPLING)));
    public static final Block BOILING_PINE_SLAB = registerBlock("boiling_pine_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block BOILING_PINE_STAIRS = registerBlock("boiling_pine_stairs", new StairsBlock( ModBlocks.BOILING_PINE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    public static final Block BOILING_PINE_DOOR = registerBlock("boiling_pine_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BOILING_PINE_TRAPDOOR = registerBlock("boiling_pine_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block BOILING_PINE_BUTTON = registerBlock("boiling_pine_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 5, true));
    public static final Block BOILING_PINE_PRESSURE_PLATE = registerBlock("boiling_pine_pressure_plate", new PressurePlateBlock( PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BOILING_PINE_FENCE_GATE = registerBlock("boiling_pine_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block BOILING_PINE_FENCE = registerBlock("boiling_pine_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));


    public static final Block BOGWOOD_CYPRESS_LOG = registerBlock("bogwood_cypress_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block BOGWOOD_CYPRESS_WOOD = registerBlock("bogwood_cypress_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BOGWOOD_CYPRESS_LOG = registerBlock("stripped_bogwood_cypress_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BOGWOOD_CYPRESS_WOOD = registerBlock("stripped_bogwood_cypress_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BOGWOOD_CYPRESS_PLANKS = registerBlock("bogwood_cypress_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BOGWOOD_CYPRESS_LEAVES = registerBlock("bogwood_cypress_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block BOGWOOD_CYPRESS_SAPLING = registerBlock("bogwood_cypress_sapling", new SaplingBlock(new BoilingPineSaplingGenerator(), FabricBlockSettings.copy(Blocks.SPRUCE_SAPLING)));
    public static final Block BOGWOOD_CYPRESS_SLAB = registerBlock("bogwood_cypress_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block BOGWOOD_CYPRESS_STAIRS = registerBlock("bogwood_cypress_stairs", new StairsBlock( ModBlocks.BOILING_PINE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    public static final Block BOGWOOD_CYPRESS_DOOR = registerBlock("bogwood_cypress_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BOGWOOD_CYPRESS_TRAPDOOR = registerBlock("bogwood_cypress_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block BOGWOOD_CYPRESS_BUTTON = registerBlock("bogwood_cypress_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 5, true));
    public static final Block BOGWOOD_CYPRESS_PRESSURE_PLATE = registerBlock("bogwood_cypress_pressure_plate", new PressurePlateBlock( PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BOGWOOD_CYPRESS_FENCE_GATE = registerBlock("bogwood_cypress_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block BOGWOOD_CYPRESS_FENCE = registerBlock("bogwood_cypress_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    public static final Block BOGWOOD_CYPRESS_ROOTS = registerBlock("bogwood_cypress_roots", new MangroveRootsBlock(FabricBlockSettings.copy(Blocks.MANGROVE_ROOTS)));


    public static final Block PRICKLY_FIR_LOG = registerBlock("prickly_fir_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block PRICKLY_FIR_WOOD = registerBlock("prickly_fir_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PRICKLY_FIR_LOG = registerBlock("stripped_prickly_fir_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PRICKLY_FIR_WOOD = registerBlock("stripped_prickly_fir_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block PRICKLY_FIR_PLANKS = registerBlock("prickly_fir_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block PRICKLY_FIR_LEAVES = registerBlock("prickly_fir_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block PRICKLY_FIR_SAPLING = registerBlock("prickly_fir_sapling", new SaplingBlock(new BoilingPineSaplingGenerator(), FabricBlockSettings.copy(Blocks.SPRUCE_SAPLING)));
    public static final Block PRICKLY_FIR_SLAB = registerBlock("prickly_fir_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block PRICKLY_FIR_STAIRS = registerBlock("prickly_fir_stairs", new StairsBlock( ModBlocks.BOILING_PINE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    public static final Block PRICKLY_FIR_DOOR = registerBlock("prickly_fir_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PRICKLY_FIR_TRAPDOOR = registerBlock("prickly_fir_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block PRICKLY_FIR_BUTTON = registerBlock("prickly_fir_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 5, true));
    public static final Block PRICKLY_FIR_PRESSURE_PLATE = registerBlock("prickly_fir_pressure_plate", new PressurePlateBlock( PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PRICKLY_FIR_FENCE_GATE = registerBlock("prickly_fir_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block PRICKLY_FIR_FENCE = registerBlock("prickly_fir_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));

    public static final Block PALISTROM_LOG = registerBlock("palistrom_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block PALISTROM_WOOD = registerBlock("palistrom_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PALISTROM_LOG = registerBlock("stripped_palistrom_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PALISTROM_WOOD = registerBlock("stripped_palistrom_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block PALISTROM_PLANKS = registerBlock("palistrom_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block PALISTROM_LEAVES = registerBlock("palistrom_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block PALISTROM_SAPLING = registerBlock("palistrom_sapling", new SaplingBlock(new BoilingPineSaplingGenerator(), FabricBlockSettings.copy(Blocks.SPRUCE_SAPLING)));
    public static final Block PALISTROM_SLAB = registerBlock("palistrom_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block PALISTROM_STAIRS = registerBlock("palistrom_stairs", new StairsBlock( ModBlocks.BOILING_PINE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    public static final Block PALISTROM_DOOR = registerBlock("palistrom_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PALISTROM_TRAPDOOR = registerBlock("palistrom_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block PALISTROM_BUTTON = registerBlock("palistrom_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 5, true));
    public static final Block PALISTROM_PRESSURE_PLATE = registerBlock("palistrom_pressure_plate", new PressurePlateBlock( PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PALISTROM_FENCE_GATE = registerBlock("palistrom_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block PALISTROM_FENCE = registerBlock("palistrom_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));


    public static final Block WRINKLING_OAK_LOG = registerBlock("wrinkling_oak_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block WRINKLING_OAK_WOOD = registerBlock("wrinkling_oak_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WRINKLING_OAK_LOG = registerBlock("stripped_wrinkling_oak_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WRINKLING_OAK_WOOD = registerBlock("stripped_wrinkling_oak_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block WRINKLING_OAK_PLANKS = registerBlock("wrinkling_oak_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block WRINKLING_OAK_LEAVES = registerBlock("wrinkling_oak_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block WRINKLING_OAK_SAPLING = registerBlock("wrinkling_oak_sapling", new SaplingBlock(new BoilingPineSaplingGenerator(), FabricBlockSettings.copy(Blocks.SPRUCE_SAPLING)));
    public static final Block WRINKLING_OAK_SLAB = registerBlock("wrinkling_oak_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block WRINKLING_OAK_STAIRS = registerBlock("wrinkling_oak_stairs", new StairsBlock( ModBlocks.BOILING_PINE_PLANKS.getDefaultState(),FabricBlockSettings.copy(Blocks.OAK_STAIRS)));
    public static final Block WRINKLING_OAK_DOOR = registerBlock("wrinkling_oak_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WRINKLING_OAK_TRAPDOOR = registerBlock("wrinkling_oak_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block WRINKLING_OAK_BUTTON = registerBlock("wrinkling_oak_button", new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 5, true));
    public static final Block WRINKLING_OAK_PRESSURE_PLATE = registerBlock("wrinkling_oak_pressure_plate", new PressurePlateBlock( PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block WRINKLING_OAK_FENCE_GATE = registerBlock("wrinkling_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block WRINKLING_OAK_FENCE = registerBlock("wrinkling_oak_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));


    public static final Block TITANSTONE = registerBlock("titanstone", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE)));
    public static final Block TITANSTONE_SLAB = registerBlock("titanstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final Block TITANSTONE_STAIRS = registerBlock("titanstone_stairs", new StairsBlock(ModBlocks.TITANSTONE.getDefaultState(),FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)));

    public static final Block FRACTURED_TITANSTONE = registerBlock("fractured_titanstone", new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block FRACTURED_TITANSTONE_SLAB = registerBlock("fractured_titanstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final Block FRACTURED_TITANSTONE_STAIRS = registerBlock("fractured_titanstone_stairs", new StairsBlock(ModBlocks.FRACTURED_TITANSTONE.getDefaultState(),FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)));
    public static final Block FRACTURED_TITANSTONE_WALL = registerBlock("fractured_titanstone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_WALL)));

    public static final Block MOSSY_FRACTURED_TITANSTONE = registerBlock("mossy_fractured_titanstone", new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block MOSSY_FRACTURED_TITANSTONE_SLAB = registerBlock("mossy_fractured_titanstone_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final Block MOSSY_FRACTURED_TITANSTONE_STAIRS = registerBlock("mossy_fractured_titanstone_stairs", new StairsBlock(ModBlocks.MOSSY_FRACTURED_TITANSTONE.getDefaultState(),FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)));
    public static final Block MOSSY_FRACTURED_TITANSTONE_WALL = registerBlock("mossy_fractured_titanstone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_WALL)));

    public static final Block TITAN_MARROW = registerBlock("titan_marrow", new Block(FabricBlockSettings.copy(Blocks.BONE_BLOCK)));
    public static final Block TITAN_BONE_BLOCK = registerBlock("titan_bone_block", new PillarBlock(FabricBlockSettings.copy(Blocks.BONE_BLOCK)));
    public static final Block FOOLS_BLOOD_DRIPSTONE = registerBlock("fools_blood_dripstone", new ModFoolsBloodDripstone(FabricBlockSettings.copy(Blocks.POINTED_DRIPSTONE)));
    public static final Block FOOLS_BLOOD_BLOCK = registerBlock("fools_blood_block", new Block(FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    public static final Block TITANSTONE_BRICKS = registerBlock("titanstone_bricks", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block TITANSTONE_BRICK_SLAB = registerBlock("titanstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block TITANSTONE_BRICK_STAIRS = registerBlock("titanstone_brick_stairs", new StairsBlock(ModBlocks.TITANSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block TITANSTONE_BRICK_WALL = registerBlock("titanstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_WALL)));

    public static final Block CRACKED_TITANSTONE_BRICKS = registerBlock("cracked_titanstone_bricks", new Block(FabricBlockSettings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));

    public static final Block MOSSY_TITANSTONE_BRICKS = registerBlock("mossy_titanstone_bricks", new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_TITANSTONE_BRICK_SLAB = registerBlock("mossy_titanstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block MOSSY_TITANSTONE_BRICK_STAIRS = registerBlock("mossy_titanstone_brick_stairs", new StairsBlock(ModBlocks.MOSSY_TITANSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block MOSSY_TITANSTONE_BRICK_WALL = registerBlock("mossy_titanstone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_WALL)));

    public static final Block CHISELED_TITANSTONE = registerBlock("chiseled_titanstone", new Block(FabricBlockSettings.copy(Blocks.CHISELED_DEEPSLATE)));


    public static final Block TITAN_BONE_BRICKS = registerBlock("titan_bone_bricks", new Block(FabricBlockSettings.copy(Blocks.BONE_BLOCK)));
    public static final Block TITAN_BONE_BRICK_SLAB = registerBlock("titan_bone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB).sounds(BlockSoundGroup.BONE)));
    public static final Block TITAN_BONE_BRICK_STAIRS = registerBlock("titan_bone_brick_stairs", new StairsBlock( ModBlocks.TITAN_BONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(Blocks.STONE_STAIRS).sounds(BlockSoundGroup.BONE)));
    public static final Block TITAN_BONE_BRICK_WALL = registerBlock("titan_bone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).sounds(BlockSoundGroup.BONE)));


    public static final Block BURNBRISTLE = registerBlock("burnbristle", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_BURNBRISTLE = registerBlockWithoutItem("potted_burnbristle", new FlowerPotBlock(ModBlocks.BURNBRISTLE, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM)));
    public static final Block NIGHTGRASS = registerBlock("nightgrass", new ModNightgrassBlock(FabricBlockSettings.copy(Blocks.GRASS)));
    public static final Block SKY_TULIP = registerBlock("sky_tulip", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.ORANGE_TULIP)));
    public static final Block POTTED_SKY_TULIP = registerBlockWithoutItem("potted_sky_tulip", new FlowerPotBlock(ModBlocks.SKY_TULIP, FabricBlockSettings.copy(Blocks.POTTED_ORANGE_TULIP)));
    public static final Block SEA_TULIP = registerBlock("sea_tulip", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.ORANGE_TULIP)));
    public static final Block POTTED_SEA_TULIP = registerBlockWithoutItem("potted_sea_tulip", new FlowerPotBlock(ModBlocks.SEA_TULIP, FabricBlockSettings.copy(Blocks.POTTED_ORANGE_TULIP)));
    public static final Block NIGHT_TULIP = registerBlock("night_tulip", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.ORANGE_TULIP)));
    public static final Block POTTED_NIGHT_TULIP = registerBlockWithoutItem("potted_night_tulip", new FlowerPotBlock(ModBlocks.NIGHT_TULIP, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM)));

    public static final Block DEMON_ROSE = registerBlock("demon_rose", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block PETUNIA = registerBlock("petunia", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.ORANGE_TULIP)));
    public static final Block WOODGRASS = registerBlock("woodgrass", new PlantBlock(FabricBlockSettings.copy(Blocks.DEAD_BUSH)));

    public static final Block BEACHGRASS = registerBlock("beachgrass", new TallSandPlantBlock(FabricBlockSettings.copy(Blocks.DEAD_BUSH)));
    public static final Block MIDNIGHT_FERN = registerBlock("midnight_fern", new FernBlock(FabricBlockSettings.copy(Blocks.FERN)));
    public static final Block GOLDENWOOD = registerBlock("goldenwood", new FernBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final Block BILE_CACTUS = registerBlock("bile_cactus", new TallSandPlantBlock(FabricBlockSettings.copy(Blocks.TALL_GRASS).sounds(BlockSoundGroup.WOOL)));
    public static final Block BALL_CACTUS = registerBlock("ball_cactus", new DeadBushBlock(FabricBlockSettings.copy(Blocks.CACTUS)));
    public static final Block SPINE_SUCCULENT = registerBlock("spine_succulent", new DeadBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block STINGING_CACTUS = registerBlock("stinging_cactus", new ModStingingCactus(FabricBlockSettings.copy(Blocks.CACTUS)));

    public static final Block FLESH_BLOCK = registerBlock("flesh_block", new SlimeBlock(FabricBlockSettings.copy(Blocks.HONEY_BLOCK)));
    public static final Block EYELIGHT = registerBlock("eyelight", new EyelightModBlock(FabricBlockSettings.copy(Blocks.COBWEB).sounds(BlockSoundGroup.SLIME).luminance(state -> 15)));

    public static final Block FLESH_TENDRILS = registerBlock("flesh_tendrils", new FleshTendrilsModBlock(FabricBlockSettings.copy(Blocks.COBWEB).sounds(BlockSoundGroup.SLIME)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(toh.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(toh.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(toh.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
    public static void registerModBlocks() {
        toh.LOGGER.debug("Registering blocks for " + toh.MOD_ID);
    }
}
