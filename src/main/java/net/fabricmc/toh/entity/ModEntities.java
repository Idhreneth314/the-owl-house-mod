package net.fabricmc.toh.entity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.toh.entity.demon_realm.FeralBipedBeastEntity;
import net.fabricmc.toh.toh;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<FeralBipedBeastEntity> FERAL_BIPED_BEAST = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(toh.MOD_ID, "feral_biped_beast"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FeralBipedBeastEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.4f)).build());

}
