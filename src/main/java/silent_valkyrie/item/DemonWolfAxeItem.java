
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
public class DemonWolfAxeItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:demon_wolf_axe")
	public static final Item block = null;

	public DemonWolfAxeItem(SilentValkyrieModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1030;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 23f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 39;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DemonWolfItem.block));
			}
		}, 1, -3f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("demon_wolf_axe"));
	}
}
