package net.fabricmc.toh.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.toh.block.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.BOILING_PINE_LOG, ModBlocks.STRIPPED_BOILING_PINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.BOILING_PINE_WOOD, ModBlocks.STRIPPED_BOILING_PINE_WOOD);

        StrippableBlockRegistry.register(ModBlocks.BOGWOOD_CYPRESS_LOG, ModBlocks.STRIPPED_BOGWOOD_CYPRESS_LOG);
        StrippableBlockRegistry.register(ModBlocks.BOGWOOD_CYPRESS_WOOD, ModBlocks.STRIPPED_BOGWOOD_CYPRESS_WOOD);

        StrippableBlockRegistry.register(ModBlocks.PRICKLY_FIR_LOG, ModBlocks.STRIPPED_PRICKLY_FIR_LOG);
        StrippableBlockRegistry.register(ModBlocks.PRICKLY_FIR_WOOD, ModBlocks.STRIPPED_PRICKLY_FIR_WOOD);

        StrippableBlockRegistry.register(ModBlocks.PALISTROM_LOG, ModBlocks.STRIPPED_PALISTROM_LOG);
        StrippableBlockRegistry.register(ModBlocks.PALISTROM_WOOD, ModBlocks.STRIPPED_PALISTROM_WOOD);

        StrippableBlockRegistry.register(ModBlocks.WRINKLING_OAK_LOG, ModBlocks.STRIPPED_WRINKLING_OAK_LOG);
        StrippableBlockRegistry.register(ModBlocks.WRINKLING_OAK_WOOD, ModBlocks.STRIPPED_WRINKLING_OAK_WOOD);
    }
}
