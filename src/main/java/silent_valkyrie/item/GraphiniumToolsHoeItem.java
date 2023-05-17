
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
public class GraphiniumToolsHoeItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:graphinium_tools_hoe")
	public static final Item block = null;

	public GraphiniumToolsHoeItem(SilentValkyrieModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GraphiniumItem.block));
			}
		}, 0, -3f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("graphinium_tools_hoe"));
	}
}
