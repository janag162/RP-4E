package net.JJ.mutminecraft.entity.client;

import net.JJ.mutminecraft.MutantMinecraft;
import net.JJ.mutminecraft.entity.custom.DirewolfEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DirewolfModel extends GeoModel<DirewolfEntity> {
    @Override
    public ResourceLocation getModelResource(DirewolfEntity animatable) {
        return new ResourceLocation(MutantMinecraft.MOD_ID, "geo/direwolf.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DirewolfEntity animatable) {
        return new ResourceLocation(MutantMinecraft.MOD_ID, "textures/entity/direwolf.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DirewolfEntity animatable) {
        return new ResourceLocation(MutantMinecraft.MOD_ID, "animation/direwolf.animation.json");
    }

    @Override
    public void setCustomAnimations(DirewolfEntity animatable, long instanceId, AnimationState<DirewolfEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if(head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
