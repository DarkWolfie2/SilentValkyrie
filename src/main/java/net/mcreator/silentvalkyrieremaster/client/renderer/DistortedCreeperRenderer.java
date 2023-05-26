
package net.mcreator.silentvalkyrieremaster.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.silentvalkyrieremaster.entity.DistortedCreeperEntity;

public class DistortedCreeperRenderer extends MobRenderer<DistortedCreeperEntity, CreeperModel<DistortedCreeperEntity>> {
	public DistortedCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DistortedCreeperEntity entity) {
		return new ResourceLocation("silentvalkyrieremaster:textures/entities/distortedcreeper.png");
	}
}
