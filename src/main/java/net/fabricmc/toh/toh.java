package net.fabricmc.toh;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.toh.block.ModBlocks;
import net.fabricmc.toh.item.ModItems;
import net.fabricmc.toh.util.ModFlammableBlocks;
import net.fabricmc.toh.util.ModStrippableBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class toh implements ModInitializer {
	public static final String MOD_ID = "toh";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippableBlocks();
	}
}
