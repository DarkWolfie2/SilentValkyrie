
package net.mcreator.silentvalkyrieremaster.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModTabs;
import net.mcreator.silentvalkyrieremaster.init.SilentvalkyrieremasterModItems;

public abstract class PlutoStoneArmorItem extends ArmorItem {
	public PlutoStoneArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.PLUTO_STONE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "pluto_stone_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PlutoStoneArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/plutosteel__layer_1.png";
		}
	}

	public static class Chestplate extends PlutoStoneArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/plutosteel__layer_1.png";
		}
	}

	public static class Leggings extends PlutoStoneArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/plutosteel__layer_2.png";
		}
	}

	public static class Boots extends PlutoStoneArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/plutosteel__layer_1.png";
		}
	}
}
