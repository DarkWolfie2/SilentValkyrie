
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkAddonsItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@SilentValkyrieModElements.ModElement.Tag
public class BL82MusicDiscItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:bl_82_music_disc")
	public static final Item block = null;

	public BL82MusicDiscItem(SilentValkyrieModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SilentValkyrieModElements.sounds.get(new ResourceLocation("silent_valkyrie:bl_82")),
					new Item.Properties().group(SilentValkAddonsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("bl_82_music_disc");
		}
	}
}
