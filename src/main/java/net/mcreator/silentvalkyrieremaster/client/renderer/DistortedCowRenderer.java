
package net.mcreator.silentvalkyrieremaster.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.silentvalkyrieremaster.entity.DistortedCowEntity;

public class DistortedCowRenderer extends MobRenderer<DistortedCowEntity, CowModel<DistortedCowEntity>> {
	public DistortedCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DistortedCowEntity entity) {
		return new ResourceLocation("silentvalkyrieremaster:textures/entities/distortedcow.png");
	}
}
