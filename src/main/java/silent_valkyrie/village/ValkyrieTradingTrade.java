
package silent_valkyrie.village;

import silent_valkyrie.item.ValkyriumSwordItem;
import silent_valkyrie.item.ValkyriumItem;
import silent_valkyrie.item.TitaniumSwordItem;
import silent_valkyrie.item.PlutoStoneSwordItem;
import silent_valkyrie.item.HardenedValkyriumItem;
import silent_valkyrie.item.HardenedPlutoSteelItem;
import silent_valkyrie.item.GraphiniumArmorArmorItem;
import silent_valkyrie.item.CryptoniumAxeItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ValkyrieTradingTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(5).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (64)), new ItemStack(Items.NETHERITE_INGOT, (int) (10)),
					new ItemStack(GraphiniumArmorArmorItem.helmet), 5, 40, 0.05f));
			trades.get(5).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (64)), new ItemStack(Items.DIAMOND, (int) (10)),
					new ItemStack(GraphiniumArmorArmorItem.body), 5, 40, 0.05f));
			trades.get(5).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (64)), new ItemStack(Items.NETHERITE_INGOT, (int) (10)),
					new ItemStack(GraphiniumArmorArmorItem.legs), 5, 40, 0.05f));
			trades.get(5).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (64)), new ItemStack(Items.DIAMOND, (int) (10)),
					new ItemStack(GraphiniumArmorArmorItem.boots), 10, 40, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(4).add(new BasicTrade(new ItemStack(HardenedValkyriumItem.block, (int) (10)), new ItemStack(Items.EMERALD, (int) (32)),
					new ItemStack(ValkyriumSwordItem.block), 10, 40, 0.05f));
			trades.get(4).add(new BasicTrade(new ItemStack(HardenedPlutoSteelItem.block, (int) (10)), new ItemStack(Items.EMERALD, (int) (32)),
					new ItemStack(PlutoStoneSwordItem.block), 10, 40, 0.05f));
			trades.get(5).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (32)), new ItemStack(ValkyriumItem.block, (int) (64)),
					new ItemStack(TitaniumSwordItem.block), 10, 40, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			trades.get(1).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (15)), new ItemStack(CryptoniumAxeItem.block), 10, 5, 0.05f));
		}
	}
}
