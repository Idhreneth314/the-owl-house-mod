package net.fabricmc.toh.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.toh.toh;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup DEMON_REALM_MISC;

    public static void registerItemGroup() {
        DEMON_REALM_MISC = FabricItemGroup.builder(new Identifier(toh.MOD_ID, "miscellaneous"))
                .displayName(Text.literal("Miscellaneous"))
                .icon(() -> new ItemStack(ModItems.SILVER_INGOT)).build();
    }
}