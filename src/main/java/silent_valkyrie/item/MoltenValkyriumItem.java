
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SilentValkyrieModElements.ModElement.Tag
public class MoltenValkyriumItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:molten_valkyrium")
	public static final Item block = null;

	public MoltenValkyriumItem(SilentValkyrieModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SilentValkItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("molten_valkyrium");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
