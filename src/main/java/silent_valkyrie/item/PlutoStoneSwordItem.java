
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@SilentValkyrieModElements.ModElement.Tag
public class PlutoStoneSwordItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:pluto_stone_sword")
	public static final Item block = null;

	public PlutoStoneSwordItem(SilentValkyrieModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 4.25f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlutoStoneItem.block));
			}
		}, 3, -2.3f, new Item.Properties().group(SilentValkItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("The Sword Crafted from the Pluto God"));
			}
		}.setRegistryName("pluto_stone_sword"));
	}
}
