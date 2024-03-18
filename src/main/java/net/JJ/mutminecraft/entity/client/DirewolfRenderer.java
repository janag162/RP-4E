package net.JJ.mutminecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JJ.mutminecraft.MutantMinecraft;
import net.JJ.mutminecraft.entity.custom.DirewolfEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DirewolfRenderer extends GeoEntityRenderer<DirewolfEntity> {
    public DirewolfRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DirewolfModel());
    }

    @Override
    public ResourceLocation getTextureLocation(DirewolfEntity animatable) {
        return new ResourceLocation(MutantMinecraft.MOD_ID, "textures/entity/direwolf.png");
    }

    @Override
    public void render(DirewolfEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
