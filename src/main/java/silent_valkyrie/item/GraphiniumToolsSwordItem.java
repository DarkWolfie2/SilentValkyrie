
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
public class GraphiniumToolsSwordItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:graphinium_tools_sword")
	public static final Item block = null;

	public GraphiniumToolsSwordItem(SilentValkyrieModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 25f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 35;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GraphiniumItem.block));
			}
		}, 3, -3f, new Item.Properties().group(SilentValkItemGroup.tab)) {
		}.setRegistryName("graphinium_tools_sword"));
	}
}
