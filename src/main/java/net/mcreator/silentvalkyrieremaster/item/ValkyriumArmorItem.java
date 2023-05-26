
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

public abstract class ValkyriumArmorItem extends ArmorItem {
	public ValkyriumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 9, 11, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 35;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilentvalkyrieremasterModItems.VALKYRIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "valkyrium_armor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ValkyriumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/valkyrium__layer_1.png";
		}
	}

	public static class Chestplate extends ValkyriumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/valkyrium__layer_1.png";
		}
	}

	public static class Leggings extends ValkyriumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/valkyrium__layer_2.png";
		}
	}

	public static class Boots extends ValkyriumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SilentvalkyrieremasterModTabs.TAB_SILENT_VALKYRIE_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "silentvalkyrieremaster:textures/models/armor/valkyrium__layer_1.png";
		}
	}
}
