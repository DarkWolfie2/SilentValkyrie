
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SilentvalkyrieremasterModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(SilentvalkyrieremasterModItems.PLUTO_STONE_INGOT.get(), 45),
				new ItemStack(Items.DIAMOND, 45), new ItemStack(SilentvalkyrieremasterModItems.VALKYRIE_DIMENSION.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.DIAMOND, 45),

				new ItemStack(SilentvalkyrieremasterModItems.HARDENED_VALKYRIUM.get(), 40), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT, 15),

				new ItemStack(SilentvalkyrieremasterModItems.TITANIUM_INGOT.get(), 5), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

				new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_INGOT.get(), 6), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.NETHERITE_INGOT, 10),
					new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_ARMOR_HELMET.get()), 5, 40, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 10),
					new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_ARMOR_CHESTPLATE.get()), 5, 40, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.NETHERITE_INGOT, 10),
					new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_ARMOR_LEGGINGS.get()), 5, 40, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.DIAMOND, 10),
					new ItemStack(SilentvalkyrieremasterModItems.GRAPHINIUM_ARMOR_BOOTS.get()), 10, 40, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SilentvalkyrieremasterModItems.HARDENED_VALKYRIUM.get(), 10),
					new ItemStack(Items.EMERALD, 32), new ItemStack(SilentvalkyrieremasterModItems.VALKYRIUM_SWORD.get()), 10, 40, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(SilentvalkyrieremasterModItems.HARDENED_PLUTO_STEEL.get(), 10),
					new ItemStack(Items.EMERALD, 32), new ItemStack(SilentvalkyrieremasterModItems.PLUTO_STONE_SWORD.get()), 10, 40, 0.05f));
			event.getTrades().get(5)
					.add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(SilentvalkyrieremasterModItems.VALKYRIUM_INGOT.get(), 64),
							new ItemStack(SilentvalkyrieremasterModItems.TITANIUM_SWORD.get()), 10, 40, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15),

					new ItemStack(SilentvalkyrieremasterModItems.CRYPTONIUM_AXE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

					new ItemStack(SilentvalkyrieremasterModItems.DEMON_WOLF_SWORD.get()), 10, 5, 0.05f));
		}
	}
}
