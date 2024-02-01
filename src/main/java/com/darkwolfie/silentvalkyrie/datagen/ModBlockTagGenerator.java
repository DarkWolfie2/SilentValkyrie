package com.darkwolfie.silentvalkyrie.datagen;

import com.darkwolfie.silentvalkyrie.Main;
import com.darkwolfie.silentvalkyrie.block.ModBlocks;
import com.darkwolfie.silentvalkyrie.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.Valkyrie_Ores).add(ModBlocks.valkyrium_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          ModBlocks.valkyrium_ORE.get(),
          ModBlocks.TestPortalBlock.get(),
          ModBlocks.Deepslate_valkyrium_ORE.get(),
          ModBlocks.Deepslate_plutosteel_ORE.get(),
          ModBlocks.plutosteel_ORE.get(),
          ModBlocks.valkyrium_block.get(),
          ModBlocks.valkyrium_ORE.get()
        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.valkyrium_ORE.get(),
                ModBlocks.Deepslate_valkyrium_ORE.get(),
                ModBlocks.valkyrium_block.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.plutosteel_ORE.get(),
                ModBlocks.Deepslate_plutosteel_ORE.get(),
                ModBlocks.plutosteel_block.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.huskyrium_block.get(),
                ModBlocks.huskyrium_ORE.get(),
                ModBlocks.Deepslate_huskyrium_ORE.get()
        );

    }
}
