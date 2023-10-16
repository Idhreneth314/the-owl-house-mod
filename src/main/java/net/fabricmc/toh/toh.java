package net.fabricmc.toh;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.toh.block.ModBlocks;
import net.fabricmc.toh.item.ModGlyphItem;
import net.fabricmc.toh.item.ModItemGroup;
import net.fabricmc.toh.item.ModItems;
import net.fabricmc.toh.util.ModFlammableBlocks;
import net.fabricmc.toh.util.ModStrippableBlocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class toh implements ModInitializer {
	public static final String MOD_ID = "toh";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ModGlyphItem GLYPH =
			Registry.register(Registries.ITEM, new Identifier("toh", "glyph"),
					new ModGlyphItem(new FabricItemSettings()));
	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippableBlocks();
	}
}
