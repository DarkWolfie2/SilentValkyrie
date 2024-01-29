package com.darkwolfie.silentvalkyrie.item;

import com.darkwolfie.silentvalkyrie.Main;
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
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
