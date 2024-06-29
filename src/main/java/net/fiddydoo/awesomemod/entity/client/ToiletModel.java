package net.fiddydoo.awesomemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fiddydoo.awesomemod.entity.animations.ModAnimationDefinitions;
import net.fiddydoo.awesomemod.entity.custom.ToiletEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ToiletModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bb_main;

	public ToiletModel(ModelPart root) {
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(28, 18).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 21).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 22.0F, 4.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 21).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 22.0F, -4.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(20, 15).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 15).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 21).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 22.0F, 4.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(6, 13).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 19).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 22.0F, -4.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(28, 29).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(42, 0).addBox(-5.0F, -9.0F, -3.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(40, 37).addBox(3.0F, -9.0F, -3.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(14, 15).addBox(-6.0F, -11.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 12).addBox(5.0F, -11.0F, -7.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(44, 12).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(47, 26).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 29).addBox(-5.0F, -3.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(22, 42).addBox(-3.0F, -3.0F, 3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(3.0F, -3.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 17).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(13, 42).addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(16, 40).addBox(-4.0F, -4.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -20.0F, 4.0F, 10.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 2).addBox(-3.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -9.0F, -4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -2.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -9.0F, 6.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 15).addBox(-3.0F, -1.0F, -6.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.0F, -3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 37).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.0F, 5.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationDefinitions.minecrafttoiletAnimation.walk, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((ToiletEntity) entity).idleAnimationState, ModAnimationDefinitions.minecrafttoiletAnimation.idle, ageInTicks, 1f);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return bb_main;
	}
}