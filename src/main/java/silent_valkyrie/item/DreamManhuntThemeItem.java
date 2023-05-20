
package silent_valkyrie.item;

import silent_valkyrie.itemgroup.SilentValkAddonsItemGroup;

import silent_valkyrie.SilentValkyrieModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@SilentValkyrieModElements.ModElement.Tag
public class DreamManhuntThemeItem extends SilentValkyrieModElements.ModElement {
	@ObjectHolder("silent_valkyrie:dream_manhunt_theme")
	public static final Item block = null;

	public DreamManhuntThemeItem(SilentValkyrieModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SilentValkyrieModElements.sounds.get(new ResourceLocation("silent_valkyrie:dreemmanhunttheme")),
					new Item.Properties().group(SilentValkAddonsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dream_manhunt_theme");
		}
	}
}
