package net.fabricmc.toh.client.renderer.entity;
import net.fabricmc.toh.client.model.entity.FeralBipedBeastModel;
import net.fabricmc.toh.entity.demon_realm.FeralBipedBeastEntity;
import net.fabricmc.toh.toh;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FeralBipedBeastRenderer extends GeoEntityRenderer<FeralBipedBeastEntity> {
    public FeralBipedBeastRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FeralBipedBeastModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(FeralBipedBeastEntity instance) {
        return new Identifier(toh.MOD_ID, "textures/entity/feral_biped_beast.png");
    }

    @Override
    public RenderLayer getRenderType(FeralBipedBeastEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}