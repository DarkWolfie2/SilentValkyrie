
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModSounds;

public class RedLikeRosesItem extends RecordItem {
	public RedLikeRosesItem() {
		super(0, SilentvalkyrieremasterModSounds.REGISTRY.get(new ResourceLocation("silentvalkyrieremaster:redlikeroses")),
				new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
