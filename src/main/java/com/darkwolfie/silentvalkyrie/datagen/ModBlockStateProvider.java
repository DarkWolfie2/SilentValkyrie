package com.darkwolfie.silentvalkyrie.datagen;

import com.darkwolfie.silentvalkyrie.Main;
import com.darkwolfie.silentvalkyrie.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output,  ExistingFileHelper exFileHelper) {
        super(output, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TestPortalBlock);
        blockWithItem(ModBlocks.plutosteel_ORE);
        blockWithItem(ModBlocks.Deepslate_plutosteel_ORE);
        blockWithItem(ModBlocks.Deepslate_valkyrium_ORE);
        blockWithItem(ModBlocks.valkyrium_ORE);
        blockWithItem(ModBlocks.valkyrium_block);
        blockWithItem(ModBlocks.plutosteel_block);
        blockWithItem(ModBlocks.huskyrium_block);
        blockWithItem(ModBlocks.huskyrium_ORE);
        blockWithItem(ModBlocks.Deepslate_huskyrium_ORE);
        blockWithItem(ModBlocks.graphinium_block);
        blockWithItem(ModBlocks.graphinium_ORE);
        blockWithItem(ModBlocks.Deepslate_graphinium_ORE);
        blockWithItem(ModBlocks.cryptonium_block);
        blockWithItem(ModBlocks.cryptonium_ORE);
        blockWithItem(ModBlocks.Deepslate_cryptonium_ORE);
        blockWithItem(ModBlocks.demonwolf_block);
        blockWithItem(ModBlocks.demonwolf_ORE);
        blockWithItem(ModBlocks.Deepslate_demonwolf_ORE);


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
