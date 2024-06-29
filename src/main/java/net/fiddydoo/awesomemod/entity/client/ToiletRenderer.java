package net.fiddydoo.awesomemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fiddydoo.awesomemod.AwesomeMod;
import net.fiddydoo.awesomemod.entity.custom.ToiletEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ToiletRenderer extends MobRenderer<ToiletEntity, ToiletModel<ToiletEntity>> {
    public ToiletRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ToiletModel<>(pContext.bakeLayer(ModModelLayers.TOILET_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(ToiletEntity toiletEntity) {
        return new ResourceLocation(AwesomeMod.MOD_ID, "textures/entity/toilet.png");
    }

    @Override
    public void render(ToiletEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
