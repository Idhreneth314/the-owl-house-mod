package net.fabricmc.toh.client.model.entity;
import net.fabricmc.toh.entity.demon_realm.FeralBipedBeastEntity;
import net.fabricmc.toh.toh;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FeralBipedBeastModel extends AnimatedGeoModel<FeralBipedBeastEntity> {
    @Override
    public Identifier getModelResource(FeralBipedBeastEntity object) {
        return new Identifier(toh.MOD_ID, "geo/feral_biped_beast.geo.json");
    }

    @Override
    public Identifier getTextureResource(FeralBipedBeastEntity object) {
        return new Identifier(toh.MOD_ID, "textures/entity/feral_biped_beast.png");
    }

    @Override
    public Identifier getAnimationResource(FeralBipedBeastEntity animatable) {
        return new Identifier(toh.MOD_ID, "animations/feral_biped_beast.animation.json");
    }
}
