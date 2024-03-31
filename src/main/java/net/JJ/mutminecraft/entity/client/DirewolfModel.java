package net.JJ.mutminecraft.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.JJ.mutminecraft.entity.animations.ModAnimationDefinitions;
import net.JJ.mutminecraft.entity.custom.DirewolfEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class DirewolfModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart body;
	private final ModelPart head;

	public DirewolfModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = body.getChild("upper_body").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(4.9F, 24.0F, -12.1F));

		PartDefinition upper_body = body.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(0, 39).addBox(-8.5F, -8.9F, -5.6F, 21.0F, 19.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -30.7F, 0.6F));

		PartDefinition middle = upper_body.addOrReplaceChild("middle", CubeListBuilder.create().texOffs(0, 0).addBox(-5.9F, -7.0161F, -11.4933F, 17.0F, 16.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(100, 53).addBox(-4.1F, -5.1161F, 10.9067F, 13.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.7F, 18.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition head = upper_body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(57, 60).addBox(-7.0F, -7.7F, -10.1F, 15.0F, 15.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -3.9F, -5.3F));

		PartDefinition maw = head.addOrReplaceChild("maw", CubeListBuilder.create(), PartPose.offset(-0.5F, 4.0F, -9.2F));

		PartDefinition upper = maw.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(22, 84).addBox(-3.0F, -2.6F, -7.0F, 8.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.6F, -0.1F));

		PartDefinition upper_teeth = upper.addOrReplaceChild("upper_teeth", CubeListBuilder.create().texOffs(16, 14).addBox(2.0F, -1.5F, -2.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 2).addBox(-0.6F, -1.5F, -2.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, -3.9F));

		PartDefinition right3_r1 = upper_teeth.addOrReplaceChild("right3_r1", CubeListBuilder.create().texOffs(2, 2).addBox(-2.7F, 0.5F, 3.4F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 12).addBox(-5.2F, 0.5F, 3.4F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 14).addBox(-5.3F, 0.5F, -3.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 4).addBox(-2.6F, 0.5F, -3.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -2.0F, 3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition lower = maw.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(82, 0).addBox(-3.0F, -1.1F, -6.4F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.9F, -0.7F));

		PartDefinition tongue = lower.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(103, 13).addBox(-2.0F, -0.6F, -6.5F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -1.5F, 1.5F));

		PartDefinition lower_teeth = lower.addOrReplaceChild("lower_teeth", CubeListBuilder.create().texOffs(13, 0).addBox(2.3F, 0.5F, -5.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(16, 12).addBox(-2.7F, 0.5F, -5.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(16, 12).addBox(-0.2F, 0.5F, -5.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.9F, -2.9F, -0.3F));

		PartDefinition right3_r2 = lower_teeth.addOrReplaceChild("right3_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2F, 0.5F, 3.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(16, 16).addBox(-3.9F, 0.5F, 3.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 10).addBox(-4.0F, 0.5F, -3.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 0).addBox(-1.0F, 0.5F, -3.7F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, -6.5F, -1.6F));

		PartDefinition left = ears.addOrReplaceChild("left", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -4.0F, -0.6F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-2.0F, -6.0F, -0.6F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(-1.0F, -8.0F, -0.6F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, -1.2F, -0.1F, 0.0F, -0.2007F, 0.0F));

		PartDefinition right = ears.addOrReplaceChild("right", CubeListBuilder.create().texOffs(0, 10).addBox(-2.8F, -4.3F, -0.1F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-1.8F, -6.3F, -0.1F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 4).addBox(-0.8F, -8.3F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -0.9F, -0.6F, 0.0F, 0.288F, 0.0F));

		PartDefinition tail = upper_body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -1.4F, 29.0F, -1.0821F, 0.0F, 0.0F));

		PartDefinition first = tail.addOrReplaceChild("first", CubeListBuilder.create().texOffs(57, 0).addBox(-3.6F, -3.0F, 0.0F, 6.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 0.0F, 0.0F));

		PartDefinition second = tail.addOrReplaceChild("second", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 0.0F, 12.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r1 = second.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 13).addBox(-3.0F, -1.8F, 11.0F, 4.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, -12.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition third = tail.addOrReplaceChild("third", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 20.3F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r2 = third.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.1F, 10.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -10.4F, 0.0698F, 0.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition front_left = legs.addOrReplaceChild("front_left", CubeListBuilder.create(), PartPose.offset(0.6F, -21.6F, 1.7F));

		PartDefinition f_l_upper = front_left.addOrReplaceChild("f_l_upper", CubeListBuilder.create().texOffs(86, 86).addBox(-3.7F, -0.8F, -3.6F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2F, 0.1F, -0.1F));

		PartDefinition f_l_lower = front_left.addOrReplaceChild("f_l_lower", CubeListBuilder.create(), PartPose.offset(-0.1F, 10.0F, -0.6F));

		PartDefinition f_l_middle = f_l_lower.addOrReplaceChild("f_l_middle", CubeListBuilder.create().texOffs(111, 67).addBox(-3.0F, 0.0F, -2.8F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 0.2F, 0.2F));

		PartDefinition f_l_paw = f_l_lower.addOrReplaceChild("f_l_paw", CubeListBuilder.create().texOffs(94, 29).addBox(-6.4F, -0.5F, -3.5F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.7F, 1.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition f_l_claws = f_l_paw.addOrReplaceChild("f_l_claws", CubeListBuilder.create().texOffs(13, 0).addBox(-3.5F, -1.8F, 1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 8).addBox(-3.5F, -1.8F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(55, 39).addBox(-3.5F, -1.8F, -3.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.9F, 2.7F, -0.2F));

		PartDefinition front_right = legs.addOrReplaceChild("front_right", CubeListBuilder.create(), PartPose.offset(-10.7F, -21.6F, 1.7F));

		PartDefinition f_r_upper = front_right.addOrReplaceChild("f_r_upper", CubeListBuilder.create().texOffs(58, 86).addBox(-3.7F, -0.8F, -3.6F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2F, 0.1F, -0.1F));

		PartDefinition f_r_lower = front_right.addOrReplaceChild("f_r_lower", CubeListBuilder.create(), PartPose.offset(-0.1F, 10.0F, -0.6F));

		PartDefinition f_r_middle = f_r_lower.addOrReplaceChild("f_r_middle", CubeListBuilder.create().texOffs(106, 109).addBox(-3.0F, 0.0F, -2.8F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 0.2F, 0.2F));

		PartDefinition f_r_paw = f_r_lower.addOrReplaceChild("f_r_paw", CubeListBuilder.create().texOffs(103, 39).addBox(-6.4F, -0.5F, -3.5F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 9.7F, 1.3F, 0.0F, -1.5708F, 0.0F));

		PartDefinition f_r_claws = f_r_paw.addOrReplaceChild("f_r_claws", CubeListBuilder.create().texOffs(55, 47).addBox(-3.5F, -1.8F, 1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(23, 71).addBox(-3.5F, -1.8F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 19).addBox(-3.5F, -1.8F, -3.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.9F, 2.7F, -0.2F));

		PartDefinition back_left = legs.addOrReplaceChild("back_left", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 24.1F));

		PartDefinition b_l_upper = back_left.addOrReplaceChild("b_l_upper", CubeListBuilder.create().texOffs(71, 30).addBox(-2.6F, -2.0F, -4.0F, 7.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -0.6F));

		PartDefinition b_l_lower = back_left.addOrReplaceChild("b_l_lower", CubeListBuilder.create(), PartPose.offset(1.0F, 12.2F, 1.8F));

		PartDefinition b_l_middle = b_l_lower.addOrReplaceChild("b_l_middle", CubeListBuilder.create().texOffs(26, 99).addBox(-2.6F, -1.6F, -3.6F, 6.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.0F, -0.2F));

		PartDefinition b_l_paw = b_l_lower.addOrReplaceChild("b_l_paw", CubeListBuilder.create().texOffs(52, 105).addBox(-6.4F, -0.5F, -3.5F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 9.9F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition b_l_claws = b_l_paw.addOrReplaceChild("b_l_claws", CubeListBuilder.create().texOffs(55, 43).addBox(-3.5F, -1.8F, 1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(67, 19).addBox(-3.5F, -1.8F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 45).addBox(-3.5F, -1.8F, -3.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 2.7F, -0.2F));

		PartDefinition back_right = legs.addOrReplaceChild("back_right", CubeListBuilder.create(), PartPose.offset(-11.4F, -23.8F, 24.4F));

		PartDefinition b_r_upper = back_right.addOrReplaceChild("b_r_upper", CubeListBuilder.create().texOffs(0, 71).addBox(-2.8F, -2.0F, -5.0F, 7.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5898F, 0.8181F, 0.1F));

		PartDefinition b_r_lower = back_right.addOrReplaceChild("b_r_lower", CubeListBuilder.create(), PartPose.offset(0.2102F, 12.4181F, 1.3F));

		PartDefinition b_r_middle = b_r_lower.addOrReplaceChild("b_r_middle", CubeListBuilder.create().texOffs(0, 94).addBox(-2.6F, -1.2F, -3.6F, 6.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 0.2F, 0.0F));

		PartDefinition b_r_paw = b_r_lower.addOrReplaceChild("b_r_paw", CubeListBuilder.create().texOffs(82, 105).addBox(-6.4F, -0.5F, -3.5F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 9.5F, 0.7F, 0.0F, -1.5708F, 0.0F));

		PartDefinition b_r_claws = b_r_paw.addOrReplaceChild("b_r_claws", CubeListBuilder.create().texOffs(57, 4).addBox(-3.5F, -1.8F, 1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 53).addBox(-3.5F, -1.8F, -0.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 0).addBox(-3.5F, -1.8F, -3.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 2.7F, -0.2F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.DIREWOLF_WALK, limbSwing, limbSwingAmount, 2f, 2.75f);
		this.animate(((DirewolfEntity) entity).idleAnimationState, ModAnimationDefinitions.DIREWOLF_IDLE, ageInTicks, 1f);
		this.animate(((DirewolfEntity) entity).attackAnimationState, ModAnimationDefinitions.DIREWOLF_ATTACK, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return body;
	}
}