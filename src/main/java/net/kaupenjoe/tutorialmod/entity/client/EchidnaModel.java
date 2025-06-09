package net.kaupenjoe.tutorialmod.entity.client;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.entity.custom.EchidnaEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class EchidnaModel extends GeoModel<EchidnaEntity> {
    @Override
    public ResourceLocation getModelResource(EchidnaEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/echidna.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EchidnaEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/echidna.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EchidnaEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/echidna.animation.json");
    }

    @Override
    public void setCustomAnimations(EchidnaEntity animatable, long instanceId, AnimationState<EchidnaEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
} 