
package net.mcreator.silentvalkyrieremaster.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class DeepslateGraphiniumOreFeature extends OreFeature {
	public static DeepslateGraphiniumOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DeepslateGraphiniumOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("silentvalkyrieremaster:deepslate_graphinium_ore", FEATURE,
				new OreConfiguration(DeepslateGraphiniumOreFeatureRuleTest.INSTANCE,
						SilentvalkyrieremasterModBlocks.DEEPSLATE_GRAPHINIUM_ORE.get().defaultBlockState(), 4));
		PLACED_FEATURE = PlacementUtils.register("silentvalkyrieremaster:deepslate_graphinium_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(2), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-17), VerticalAnchor.absolute(8)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("dripstone_caves"), new ResourceLocation("plains"),
			new ResourceLocation("lush_caves"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public DeepslateGraphiniumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class DeepslateGraphiniumOreFeatureRuleTest extends RuleTest {
		static final DeepslateGraphiniumOreFeatureRuleTest INSTANCE = new DeepslateGraphiniumOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<DeepslateGraphiniumOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<DeepslateGraphiniumOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("silentvalkyrieremaster:deepslate_graphinium_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
