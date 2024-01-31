package com.darkwolfie.silentvalkyrie.datagen;
import com.darkwolfie.silentvalkyrie.Main;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        PackOutput pack = gen.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();

        gen.addProvider(event.includeServer(), new ModRecipeProvider(pack));
        gen.addProvider(event.includeServer(), ModLootTableProvider.create(pack));
        gen.addProvider(event.includeClient(), new ModBlockStateProvider(pack, helper));
        gen.addProvider(event.includeClient(), new ModItemModelProvider(pack, helper));
        ModBlockTagGenerator Blockgen = gen.addProvider(event.includeServer(),
                new ModBlockTagGenerator(pack, lookup, helper));
        gen.addProvider(event.includeServer(), new ModItemTagGenerator(pack, lookup, Blockgen.contentsGetter(), helper));
    }
}
