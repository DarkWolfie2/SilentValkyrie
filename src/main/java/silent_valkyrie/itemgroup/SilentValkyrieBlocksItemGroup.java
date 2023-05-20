
package silent_valkyrie.itemgroup;

import silent_valkyrie.block.ValkyrieWoodLogBlock;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SilentValkyrieModElements.ModElement.Tag
public class SilentValkyrieBlocksItemGroup extends SilentValkyrieModElements.ModElement {
	public SilentValkyrieBlocksItemGroup(SilentValkyrieModElements instance) {
		super(instance, 218);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsilent_valkyrie_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ValkyrieWoodLogBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
