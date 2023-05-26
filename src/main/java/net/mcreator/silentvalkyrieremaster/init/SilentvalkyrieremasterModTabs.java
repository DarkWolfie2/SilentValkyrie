
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SilentvalkyrieremasterModTabs {
	public static CreativeModeTab TAB_SILENT_VALKYRIE_BLOCKS;
	public static CreativeModeTab TAB_SILENT_VALKYRIE_ITEMS;
	public static CreativeModeTab TAB_SILENT_VALKYRIE_MISC;
	public static CreativeModeTab TAB_SILENT_VALKYRIE_ORES;

	public static void load() {
		TAB_SILENT_VALKYRIE_BLOCKS = new CreativeModeTab("tabsilent_valkyrie_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SilentvalkyrieremasterModBlocks.VALKYRIE_GRASS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SILENT_VALKYRIE_ITEMS = new CreativeModeTab("tabsilent_valkyrie_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SilentvalkyrieremasterModItems.PLUTO_STONE_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SILENT_VALKYRIE_MISC = new CreativeModeTab("tabsilent_valkyrie_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SilentvalkyrieremasterModItems.MOLTEN_PLUTO_STEEL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SILENT_VALKYRIE_ORES = new CreativeModeTab("tabsilent_valkyrie_ores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SilentvalkyrieremasterModBlocks.DEEPSLATE_PLUTO_STONE_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
