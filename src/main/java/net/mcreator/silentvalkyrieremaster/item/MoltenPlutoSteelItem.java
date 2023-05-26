
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;

public class MoltenPlutoSteelItem extends Item {
	public MoltenPlutoSteelItem() {
		super(new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ORES).stacksTo(64).rarity(Rarity.COMMON));
	}
}
