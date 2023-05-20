
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkAddonsItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@SilentValkyrieModElements.ModElement.Tag
public class RedLikeRosesFullVersionItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:red_like_roses_full_version")
	public static final Item block = null;

	public RedLikeRosesFullVersionItem(SilentValkyrieModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SilentValkyrieModElements.sounds.get(new ResourceLocation("silent_valkyrie:redlikeroses")),
					new Item.Properties().group(SilentValkAddonsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("red_like_roses_full_version");
		}
	}
}
