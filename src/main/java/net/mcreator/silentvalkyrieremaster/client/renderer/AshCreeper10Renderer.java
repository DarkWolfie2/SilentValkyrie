
package net.mcreator.silentvalkyrieremaster.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.silentvalkyrieremaster.entity.AshCreeper10Entity;

public class AshCreeper10Renderer extends HumanoidMobRenderer<AshCreeper10Entity, HumanoidModel<AshCreeper10Entity>> {
	public AshCreeper10Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AshCreeper10Entity entity) {
		return new ResourceLocation("silentvalkyrieremaster:textures/entities/ashcreeper10ai.png");
	}
}
