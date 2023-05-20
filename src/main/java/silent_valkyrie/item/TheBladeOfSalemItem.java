
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@SilentValkyrieModElements.ModElement.Tag
public class TheBladeOfSalemItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:the_blade_of_salem")
	public static final Item block = null;

	public TheBladeOfSalemItem(SilentValkyrieModElements instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 25f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 15;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ValkyriumItem.block));
			}
		}, 3, 0f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("the_blade_of_salem"));
	}
}
