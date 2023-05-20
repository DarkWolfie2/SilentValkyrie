
package silent_valkyrie.itemgroup;

import silent_valkyrie.item.ValkyriumItem;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SilentValkyrieModElements.ModElement.Tag
public class SilentValkItemGroup extends SilentValkyrieModElements.ModElement {
	public SilentValkItemGroup(SilentValkyrieModElements instance) {
		super(instance, 136);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsilent_valk") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ValkyriumItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
