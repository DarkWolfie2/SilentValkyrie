
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@SilentValkyrieModElements.ModElement.Tag
public class BloodShovelItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:blood_shovel")
	public static final Item block = null;

	public BloodShovelItem(SilentValkyrieModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 1, -3f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("blood_shovel"));
	}
}
