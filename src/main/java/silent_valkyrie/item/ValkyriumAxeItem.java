
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
public class ValkyriumAxeItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:valkyrium_axe")
	public static final Item block = null;

	public ValkyriumAxeItem(SilentValkyrieModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 6039;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ValkyriumItem.block));
			}
		}, 1, -2f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("valkyrium_axe"));
	}
}
