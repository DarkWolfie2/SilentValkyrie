
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

public class HuskyriumPickaxeItem extends PickaxeItem {
	public HuskyriumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.HUSKYRIUM.get()));
			}
		}, 1, 1f, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
	}
}
