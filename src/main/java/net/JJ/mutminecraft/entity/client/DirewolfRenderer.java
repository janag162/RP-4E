package net.JJ.mutminecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.JJ.mutminecraft.MutantMinecraft;
import net.JJ.mutminecraft.entity.custom.DirewolfEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DirewolfRenderer extends MobRenderer<DirewolfEntity, DirewolfModel<DirewolfEntity>> {
    public DirewolfRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DirewolfModel<>(pContext.bakeLayer(ModModelLayers.DIREWOLF_LAYER)), 1);
    }

    @Override
    public ResourceLocation getTextureLocation(DirewolfEntity direwolfEntity) {
        return new ResourceLocation(MutantMinecraft.MOD_ID, "textures/entity/direwolf_wild.png");
    }

    @Override
    public void render(DirewolfEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
