
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.silentvalkyrieremaster.block.ValkyriumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyriumBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieWoodBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieStairsBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieSlabBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyriePressurePlateBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyriePlanksBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieLogBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieLeavesBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieGrassBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieFenceGateBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieFenceBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieDirtBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieDimensionPortalBlock;
import net.mcreator.silentvalkyrieremaster.block.ValkyrieButtonBlock;
import net.mcreator.silentvalkyrieremaster.block.TitaniumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.TitaniumBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoWoodBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoStoneOreBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoStoneBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoStairsBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoSlabBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoPressurePlateBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoPlanksBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoLogBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoLeavesBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoGrassBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoFenceGateBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoFenceBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoDirtBlock;
import net.mcreator.silentvalkyrieremaster.block.PlutoButtonBlock;
import net.mcreator.silentvalkyrieremaster.block.HuskyriumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.HuskyriumBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.GraphiniumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.GraphiniumBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.DemonWolfOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DemonWolfBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateValkyriumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateTitaniumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslatePlutoStoneOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateHuskyriumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateGraphiniumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateDemonWolfOreBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateCryptoniumBlock;
import net.mcreator.silentvalkyrieremaster.block.DeepslateBloodOreBlock;
import net.mcreator.silentvalkyrieremaster.block.CryptoniumOreBlock;
import net.mcreator.silentvalkyrieremaster.block.CryptoniumBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneWoodBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneStairsBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneSlabBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbanePressurePlateBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbanePlanksBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneLogBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneLeavesBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneFenceGateBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneFenceBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodbaneButtonBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodOreBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodBlockBlock;
import net.mcreator.silentvalkyrieremaster.block.BloodBaneGrassBlock;
import net.mcreator.silentvalkyrieremaster.SilentvalkyrieremasterMod;

public class SilentvalkyrieremasterModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SilentvalkyrieremasterMod.MODID);
	public static final RegistryObject<Block> PLUTO_STONE_ORE = REGISTRY.register("pluto_stone_ore", () -> new PlutoStoneOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_PLUTO_STONE_ORE = REGISTRY.register("deepslate_pluto_stone_ore",
			() -> new DeepslatePlutoStoneOreBlock());
	public static final RegistryObject<Block> PLUTO_STONE_BLOCK = REGISTRY.register("pluto_stone_block", () -> new PlutoStoneBlockBlock());
	public static final RegistryObject<Block> VALKYRIUM_ORE = REGISTRY.register("valkyrium_ore", () -> new ValkyriumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_VALKYRIUM_ORE = REGISTRY.register("deepslate_valkyrium_ore",
			() -> new DeepslateValkyriumOreBlock());
	public static final RegistryObject<Block> VALKYRIUM_BLOCK = REGISTRY.register("valkyrium_block", () -> new ValkyriumBlockBlock());
	public static final RegistryObject<Block> HUSKYRIUM_ORE = REGISTRY.register("huskyrium_ore", () -> new HuskyriumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_HUSKYRIUM_ORE = REGISTRY.register("deepslate_huskyrium_ore",
			() -> new DeepslateHuskyriumOreBlock());
	public static final RegistryObject<Block> HUSKYRIUM_BLOCK = REGISTRY.register("huskyrium_block", () -> new HuskyriumBlockBlock());
	public static final RegistryObject<Block> GRAPHINIUM_ORE = REGISTRY.register("graphinium_ore", () -> new GraphiniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_GRAPHINIUM_ORE = REGISTRY.register("deepslate_graphinium_ore",
			() -> new DeepslateGraphiniumOreBlock());
	public static final RegistryObject<Block> GRAPHINIUM_BLOCK = REGISTRY.register("graphinium_block", () -> new GraphiniumBlockBlock());
	public static final RegistryObject<Block> CRYPTONIUM_ORE = REGISTRY.register("cryptonium_ore", () -> new CryptoniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_CRYPTONIUM = REGISTRY.register("deepslate_cryptonium", () -> new DeepslateCryptoniumBlock());
	public static final RegistryObject<Block> CRYPTONIUM_BLOCK = REGISTRY.register("cryptonium_block", () -> new CryptoniumBlockBlock());
	public static final RegistryObject<Block> DEMON_WOLF_ORE = REGISTRY.register("demon_wolf_ore", () -> new DemonWolfOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_DEMON_WOLF_ORE = REGISTRY.register("deepslate_demon_wolf_ore",
			() -> new DeepslateDemonWolfOreBlock());
	public static final RegistryObject<Block> DEMON_WOLF_BLOCK = REGISTRY.register("demon_wolf_block", () -> new DemonWolfBlockBlock());
	public static final RegistryObject<Block> BLOOD_ORE = REGISTRY.register("blood_ore", () -> new BloodOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_BLOOD_ORE = REGISTRY.register("deepslate_blood_ore", () -> new DeepslateBloodOreBlock());
	public static final RegistryObject<Block> BLOOD_BLOCK = REGISTRY.register("blood_block", () -> new BloodBlockBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = REGISTRY.register("deepslate_titanium_ore",
			() -> new DeepslateTitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> BLOODBANE_WOOD = REGISTRY.register("bloodbane_wood", () -> new BloodbaneWoodBlock());
	public static final RegistryObject<Block> BLOODBANE_LOG = REGISTRY.register("bloodbane_log", () -> new BloodbaneLogBlock());
	public static final RegistryObject<Block> BLOODBANE_PLANKS = REGISTRY.register("bloodbane_planks", () -> new BloodbanePlanksBlock());
	public static final RegistryObject<Block> BLOODBANE_LEAVES = REGISTRY.register("bloodbane_leaves", () -> new BloodbaneLeavesBlock());
	public static final RegistryObject<Block> BLOODBANE_STAIRS = REGISTRY.register("bloodbane_stairs", () -> new BloodbaneStairsBlock());
	public static final RegistryObject<Block> BLOODBANE_SLAB = REGISTRY.register("bloodbane_slab", () -> new BloodbaneSlabBlock());
	public static final RegistryObject<Block> BLOODBANE_FENCE = REGISTRY.register("bloodbane_fence", () -> new BloodbaneFenceBlock());
	public static final RegistryObject<Block> BLOODBANE_BUTTON = REGISTRY.register("bloodbane_button", () -> new BloodbaneButtonBlock());
	public static final RegistryObject<Block> BLOODBANE_FENCE_GATE = REGISTRY.register("bloodbane_fence_gate", () -> new BloodbaneFenceGateBlock());
	public static final RegistryObject<Block> BLOODBANE_PRESSURE_PLATE = REGISTRY.register("bloodbane_pressure_plate",
			() -> new BloodbanePressurePlateBlock());
	public static final RegistryObject<Block> PLUTO_GRASS = REGISTRY.register("pluto_grass", () -> new PlutoGrassBlock());
	public static final RegistryObject<Block> PLUTO_DIRT = REGISTRY.register("pluto_dirt", () -> new PlutoDirtBlock());
	public static final RegistryObject<Block> PLUTO_WOOD = REGISTRY.register("pluto_wood", () -> new PlutoWoodBlock());
	public static final RegistryObject<Block> PLUTO_LOG = REGISTRY.register("pluto_log", () -> new PlutoLogBlock());
	public static final RegistryObject<Block> PLUTO_PLANKS = REGISTRY.register("pluto_planks", () -> new PlutoPlanksBlock());
	public static final RegistryObject<Block> PLUTO_LEAVES = REGISTRY.register("pluto_leaves", () -> new PlutoLeavesBlock());
	public static final RegistryObject<Block> PLUTO_STAIRS = REGISTRY.register("pluto_stairs", () -> new PlutoStairsBlock());
	public static final RegistryObject<Block> PLUTO_SLAB = REGISTRY.register("pluto_slab", () -> new PlutoSlabBlock());
	public static final RegistryObject<Block> PLUTO_FENCE = REGISTRY.register("pluto_fence", () -> new PlutoFenceBlock());
	public static final RegistryObject<Block> PLUTO_BUTTON = REGISTRY.register("pluto_button", () -> new PlutoButtonBlock());
	public static final RegistryObject<Block> PLUTO_FENCE_GATE = REGISTRY.register("pluto_fence_gate", () -> new PlutoFenceGateBlock());
	public static final RegistryObject<Block> PLUTO_PRESSURE_PLATE = REGISTRY.register("pluto_pressure_plate", () -> new PlutoPressurePlateBlock());
	public static final RegistryObject<Block> VALKYRIE_GRASS = REGISTRY.register("valkyrie_grass", () -> new ValkyrieGrassBlock());
	public static final RegistryObject<Block> VALKYRIE_DIRT = REGISTRY.register("valkyrie_dirt", () -> new ValkyrieDirtBlock());
	public static final RegistryObject<Block> VALKYRIE_WOOD = REGISTRY.register("valkyrie_wood", () -> new ValkyrieWoodBlock());
	public static final RegistryObject<Block> VALKYRIE_LOG = REGISTRY.register("valkyrie_log", () -> new ValkyrieLogBlock());
	public static final RegistryObject<Block> VALKYRIE_PLANKS = REGISTRY.register("valkyrie_planks", () -> new ValkyriePlanksBlock());
	public static final RegistryObject<Block> VALKYRIE_LEAVES = REGISTRY.register("valkyrie_leaves", () -> new ValkyrieLeavesBlock());
	public static final RegistryObject<Block> VALKYRIE_STAIRS = REGISTRY.register("valkyrie_stairs", () -> new ValkyrieStairsBlock());
	public static final RegistryObject<Block> VALKYRIE_SLAB = REGISTRY.register("valkyrie_slab", () -> new ValkyrieSlabBlock());
	public static final RegistryObject<Block> VALKYRIE_FENCE = REGISTRY.register("valkyrie_fence", () -> new ValkyrieFenceBlock());
	public static final RegistryObject<Block> VALKYRIE_BUTTON = REGISTRY.register("valkyrie_button", () -> new ValkyrieButtonBlock());
	public static final RegistryObject<Block> VALKYRIE_FENCE_GATE = REGISTRY.register("valkyrie_fence_gate", () -> new ValkyrieFenceGateBlock());
	public static final RegistryObject<Block> VALKYRIE_PRESSURE_PLATE = REGISTRY.register("valkyrie_pressure_plate",
			() -> new ValkyriePressurePlateBlock());
	public static final RegistryObject<Block> VALKYRIE_DIMENSION_PORTAL = REGISTRY.register("valkyrie_dimension_portal",
			() -> new ValkyrieDimensionPortalBlock());
	public static final RegistryObject<Block> BLOOD_BANE_GRASS = REGISTRY.register("blood_bane_grass", () -> new BloodBaneGrassBlock());
}
