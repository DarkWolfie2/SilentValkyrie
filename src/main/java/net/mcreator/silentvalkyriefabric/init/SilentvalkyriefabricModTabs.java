
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyriefabric.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class SilentvalkyriefabricModTabs {
	public static CreativeModeTab TAB_SILENT_VALKYRIE_ITEMS;

	public static void load() {
		TAB_SILENT_VALKYRIE_ITEMS = FabricItemGroupBuilder.create(new ResourceLocation("silentvalkyriefabric", "silent_valkyrie_items"))
				.icon(() -> new ItemStack(Blocks.REINFORCED_DEEPSLATE)).build();
	}
}
