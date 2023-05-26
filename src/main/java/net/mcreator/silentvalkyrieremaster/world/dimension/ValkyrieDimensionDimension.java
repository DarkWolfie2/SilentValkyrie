
package net.mcreator.silentvalkyrieremaster.world.dimension;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModBlocks;

import java.util.Set;
import java.util.HashSet;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class ValkyrieDimensionDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(Blocks.STONE);
			replaceableBlocks.add(SilentvalkyrieremasterModBlocks.VALKYRIE_GRASS.get());
			replaceableBlocks.add(SilentvalkyrieremasterModBlocks.VALKYRIE_DIRT.get());
			replaceableBlocks.add(SilentvalkyrieremasterModBlocks.PLUTO_GRASS.get());
			replaceableBlocks.add(SilentvalkyrieremasterModBlocks.PLUTO_DIRT.get());
			replaceableBlocks.add(SilentvalkyrieremasterModBlocks.BLOOD_BANE_GRASS.get());
			replaceableBlocks.add(SilentvalkyrieremasterModBlocks.VALKYRIE_DIRT.get());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks)
						.addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks)
						.addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.701960784314, 0.027450980392, 0.741176470588);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(
					() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("silentvalkyrieremaster:valkyrie_dimension"), customEffect));
		}
	}
}
