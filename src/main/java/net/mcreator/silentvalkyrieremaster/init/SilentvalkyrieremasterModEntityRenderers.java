
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.silentvalkyrieremaster.client.renderer.TheOneRenderer;
import net.mcreator.silentvalkyrieremaster.client.renderer.SilentValkyrieRenderer;
import net.mcreator.silentvalkyrieremaster.client.renderer.SalemRenderer;
import net.mcreator.silentvalkyrieremaster.client.renderer.PlutoRenderer;
import net.mcreator.silentvalkyrieremaster.client.renderer.DistortedCreeperRenderer;
import net.mcreator.silentvalkyrieremaster.client.renderer.DistortedCowRenderer;
import net.mcreator.silentvalkyrieremaster.client.renderer.AshCreeper10Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SilentvalkyrieremasterModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.SILENT_VALKYRIE.get(), SilentValkyrieRenderer::new);
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.PLUTO.get(), PlutoRenderer::new);
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.THE_ONE.get(), TheOneRenderer::new);
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.DISTORTED_CREEPER.get(), DistortedCreeperRenderer::new);
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.DISTORTED_COW.get(), DistortedCowRenderer::new);
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.ASH_CREEPER_10.get(), AshCreeper10Renderer::new);
		event.registerEntityRenderer(SilentvalkyrieremasterModEntities.SALEM.get(), SalemRenderer::new);
	}
}
