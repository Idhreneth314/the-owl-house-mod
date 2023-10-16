package net.fabricmc.toh.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.toh.block.ModBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.BOILING_PINE_PLANKS, 5, 20);
        registry.add(ModBlocks.BOILING_PINE_LEAVES, 5, 60);
        registry.add(ModBlocks.BOILING_PINE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_BOILING_PINE_LOG, 5, 5);
        registry.add(ModBlocks.BOILING_PINE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_BOILING_PINE_WOOD, 5, 5);

        registry.add(ModBlocks.BOGWOOD_CYPRESS_PLANKS, 5, 20);
        registry.add(ModBlocks.BOGWOOD_CYPRESS_LEAVES, 5, 60);
        registry.add(ModBlocks.BOGWOOD_CYPRESS_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_BOGWOOD_CYPRESS_LOG, 5, 5);
        registry.add(ModBlocks.BOGWOOD_CYPRESS_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_BOGWOOD_CYPRESS_WOOD, 5, 5);

        registry.add(ModBlocks.PRICKLY_FIR_PLANKS, 5, 20);
        registry.add(ModBlocks.PRICKLY_FIR_LEAVES, 5, 60);
        registry.add(ModBlocks.PRICKLY_FIR_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_PRICKLY_FIR_LOG, 5, 5);
        registry.add(ModBlocks.PRICKLY_FIR_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_PRICKLY_FIR_WOOD, 5, 5);

        registry.add(ModBlocks.PALISTROM_PLANKS, 5, 20);
        registry.add(ModBlocks.PALISTROM_LEAVES, 5, 60);
        registry.add(ModBlocks.PALISTROM_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_PALISTROM_LOG, 5, 5);
        registry.add(ModBlocks.PALISTROM_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_PALISTROM_WOOD, 5, 5);

        registry.add(ModBlocks.WRINKLING_OAK_PLANKS, 5, 20);
        registry.add(ModBlocks.WRINKLING_OAK_LEAVES, 5, 60);
        registry.add(ModBlocks.WRINKLING_OAK_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_WRINKLING_OAK_LOG, 5, 5);
        registry.add(ModBlocks.WRINKLING_OAK_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_WRINKLING_OAK_WOOD, 5, 5);

    }
}
