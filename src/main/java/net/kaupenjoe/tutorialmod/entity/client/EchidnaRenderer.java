package net.kaupenjoe.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.entity.custom.EchidnaEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class EchidnaRenderer extends GeoEntityRenderer<EchidnaEntity> {
    public EchidnaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EchidnaModel());
    }

    @Override
    public ResourceLocation getTextureLocation(EchidnaEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/echidna.png");
    }

    @Override
    public void render(EchidnaEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
} 