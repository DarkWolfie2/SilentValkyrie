
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

public class PlutoStoneSwordItem extends SwordItem {
	public PlutoStoneSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 4.25f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.PLUTO_STONE_INGOT.get()));
			}
		}, 3, -2.3f, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
	}
}
