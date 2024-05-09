package com.darkwolfie.silentvalkyrie.item;

import com.darkwolfie.silentvalkyrie.Main;
import com.darkwolfie.silentvalkyrie.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final RegistryObject<CreativeModeTab> ORES_TAB = CREATIVE_MODE_TABS.register("ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PlutoSteel.get()))
                    .title(Component.translatable("creativetab.sv.ore_tab_thing_ig"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PlutoSteel.get());
                        pOutput.accept(ModItems.MOLTEN_PLUTOSTEEL.get());
                        pOutput.accept(ModItems.HARDENED_PLUTOSTEEL.get());
                        pOutput.accept(ModBlocks.plutosteel_block.get());
                        pOutput.accept(ModBlocks.plutosteel_ORE.get());
                        pOutput.accept(ModBlocks.Deepslate_plutosteel_ORE.get());
                        pOutput.accept(ModItems.valkyrium.get());
                        pOutput.accept(ModItems.MOLTEN_valkyrium.get());
                        pOutput.accept(ModItems.HARDENED_valkyrium.get());
                        pOutput.accept(ModBlocks.Deepslate_valkyrium_ORE.get());
                        pOutput.accept(ModBlocks.valkyrium_ORE.get());
                        pOutput.accept(ModBlocks.valkyrium_block.get());
                        pOutput.accept(ModBlocks.TestPortalBlock.get());
                        pOutput.accept(ModItems.huskyrium.get());
                        pOutput.accept(ModItems.MOLTEN_huskyrium.get());
                        pOutput.accept(ModItems.HARDENED_huskyrium.get());
                        pOutput.accept(ModBlocks.huskyrium_block.get());
                        pOutput.accept(ModBlocks.Deepslate_huskyrium_ORE.get());
                        pOutput.accept(ModBlocks.huskyrium_ORE.get());
                        pOutput.accept(ModItems.graphinium.get());
                        pOutput.accept(ModItems.MOLTEN_graphinium.get());
                        pOutput.accept(ModItems.HARDENED_graphinium.get());
                        pOutput.accept(ModBlocks.graphinium_block.get());
                        pOutput.accept(ModBlocks.Deepslate_graphinium_ORE.get());
                        pOutput.accept(ModBlocks.graphinium_ORE.get());
                        pOutput.accept(ModItems.cryptonium.get());
                        pOutput.accept(ModBlocks.cryptonium_block.get());
                        pOutput.accept(ModBlocks.Deepslate_cryptonium_ORE.get());
                        pOutput.accept(ModBlocks.cryptonium_ORE.get());
                        pOutput.accept(ModItems.demonwolf.get());
                        pOutput.accept(ModBlocks.demonwolf_block.get());
                        pOutput.accept(ModBlocks.Deepslate_demonwolf_ORE.get());
                        pOutput.accept(ModBlocks.demonwolf_ORE.get());
                        pOutput.accept(ModItems.glizzy.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
