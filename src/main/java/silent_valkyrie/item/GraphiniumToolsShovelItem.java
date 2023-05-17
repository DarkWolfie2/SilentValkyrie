
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
public class GraphiniumToolsShovelItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:graphinium_tools_shovel")
	public static final Item block = null;

	public GraphiniumToolsShovelItem(SilentValkyrieModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GraphiniumItem.block));
			}
		}, 1, -3f, new Item.Properties().group(SilentValkItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("graphinium_tools_shovel"));
	}
}
