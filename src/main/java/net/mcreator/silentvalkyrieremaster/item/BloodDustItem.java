
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;

public class BloodDustItem extends Item {
	public BloodDustItem() {
		super(new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ORES).stacksTo(64).rarity(Rarity.COMMON));
	}
}
