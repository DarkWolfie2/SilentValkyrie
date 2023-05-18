
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@SilentValkyrieModElements.ModElement.Tag
public class TitaniumHoeItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:titanium_hoe")
	public static final Item block = null;

	public TitaniumHoeItem(SilentValkyrieModElements instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("titanium_hoe"));
	}
}
