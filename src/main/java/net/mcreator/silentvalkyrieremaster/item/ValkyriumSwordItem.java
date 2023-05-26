
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

public class ValkyriumSwordItem extends SwordItem {
	public ValkyriumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6039;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.VALKYRIUM_INGOT.get()));
			}
		}, 3, -1.5f, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS).fireResistant());
	}
}
