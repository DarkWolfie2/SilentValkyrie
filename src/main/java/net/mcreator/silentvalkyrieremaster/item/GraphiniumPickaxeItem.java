
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

public class GraphiniumPickaxeItem extends PickaxeItem {
	public GraphiniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1024;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
	}
}
