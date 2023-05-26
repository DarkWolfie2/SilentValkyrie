
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.silentvalkyrieremaster.world.features.ores.ValkyriumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.TitaniumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.PlutoStoneOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.HuskyriumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.GraphiniumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DemonWolfOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateValkyriumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateTitaniumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslatePlutoStoneOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateHuskyriumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateGraphiniumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateDemonWolfOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateCryptoniumFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.DeepslateBloodOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.CryptoniumOreFeature;
import net.mcreator.silentvalkyrieremaster.world.features.ores.BloodOreFeature;
import net.mcreator.silentvalkyrieremaster.SilentvalkyrieremasterMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class SilentvalkyrieremasterModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SilentvalkyrieremasterMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PLUTO_STONE_ORE = register("pluto_stone_ore", PlutoStoneOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PlutoStoneOreFeature.GENERATE_BIOMES,
					PlutoStoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_PLUTO_STONE_ORE = register("deepslate_pluto_stone_ore",
			DeepslatePlutoStoneOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					DeepslatePlutoStoneOreFeature.GENERATE_BIOMES, DeepslatePlutoStoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VALKYRIUM_ORE = register("valkyrium_ore", ValkyriumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ValkyriumOreFeature.GENERATE_BIOMES, ValkyriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_VALKYRIUM_ORE = register("deepslate_valkyrium_ore",
			DeepslateValkyriumOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					DeepslateValkyriumOreFeature.GENERATE_BIOMES, DeepslateValkyriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HUSKYRIUM_ORE = register("huskyrium_ore", HuskyriumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, HuskyriumOreFeature.GENERATE_BIOMES, HuskyriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_HUSKYRIUM_ORE = register("deepslate_huskyrium_ore",
			DeepslateHuskyriumOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					DeepslateHuskyriumOreFeature.GENERATE_BIOMES, DeepslateHuskyriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRAPHINIUM_ORE = register("graphinium_ore", GraphiniumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, GraphiniumOreFeature.GENERATE_BIOMES, GraphiniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_GRAPHINIUM_ORE = register("deepslate_graphinium_ore",
			DeepslateGraphiniumOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					DeepslateGraphiniumOreFeature.GENERATE_BIOMES, DeepslateGraphiniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYPTONIUM_ORE = register("cryptonium_ore", CryptoniumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CryptoniumOreFeature.GENERATE_BIOMES, CryptoniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_CRYPTONIUM = register("deepslate_cryptonium", DeepslateCryptoniumFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateCryptoniumFeature.GENERATE_BIOMES,
					DeepslateCryptoniumFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEMON_WOLF_ORE = register("demon_wolf_ore", DemonWolfOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, DemonWolfOreFeature.GENERATE_BIOMES, DemonWolfOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_DEMON_WOLF_ORE = register("deepslate_demon_wolf_ore",
			DeepslateDemonWolfOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					DeepslateDemonWolfOreFeature.GENERATE_BIOMES, DeepslateDemonWolfOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLOOD_ORE = register("blood_ore", BloodOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BloodOreFeature.GENERATE_BIOMES, BloodOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_BLOOD_ORE = register("deepslate_blood_ore", DeepslateBloodOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateBloodOreFeature.GENERATE_BIOMES,
					DeepslateBloodOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = register("titanium_ore", TitaniumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TitaniumOreFeature.GENERATE_BIOMES, TitaniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_TITANIUM_ORE = register("deepslate_titanium_ore", DeepslateTitaniumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateTitaniumOreFeature.GENERATE_BIOMES,
					DeepslateTitaniumOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
