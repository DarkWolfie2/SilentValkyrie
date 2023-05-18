
package silent_valkyrie.itemgroup;

import silent_valkyrie.item.DimensionStarNetherItem;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SilentValkyrieModElements.ModElement.Tag
public class SilentValkAddonsItemGroup extends SilentValkyrieModElements.ModElement {
	public SilentValkAddonsItemGroup(SilentValkyrieModElements instance) {
		super(instance, 152);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsilent_valk_addons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DimensionStarNetherItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
