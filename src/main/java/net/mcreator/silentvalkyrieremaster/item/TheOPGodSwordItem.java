
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

import java.util.List;

public class TheOPGodSwordItem extends SwordItem {
	public TheOPGodSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 80f;
			}

			public float getAttackDamageBonus() {
				return 1498f;
			}

			public int getLevel() {
				return 50;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), new ItemStack(Items.ENDER_EYE), new ItemStack(Items.BLAZE_ROD),
						new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_INGOT.get()), new ItemStack(Items.WITHER_SKELETON_SKULL));
			}
		}, 3, 46f, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("This Sword is Forged By The God of this World"));
	}
}
