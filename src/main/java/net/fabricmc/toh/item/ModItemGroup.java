package net.fabricmc.toh.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.toh.toh;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DEMON_REALM_MISC = FabricItemGroupBuilder.build(new Identifier(toh.MOD_ID, "miscellaneous"), () -> new ItemStack(ModItems.SILVER_INGOT));
}
