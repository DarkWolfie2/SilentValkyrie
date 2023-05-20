
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@SilentValkyrieModElements.ModElement.Tag
public class BloodAxeItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:blood_axe")
	public static final Item block = null;

	public BloodAxeItem(SilentValkyrieModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BloodDustDustItem.block));
			}
		}, 1, -3.3f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("blood_axe"));
	}
}
