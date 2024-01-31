package com.darkwolfie.silentvalkyrie.datagen.loot;

import com.darkwolfie.silentvalkyrie.block.ModBlocks;
import com.darkwolfie.silentvalkyrie.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TestPortalBlock.get());
        this.dropSelf(ModBlocks.valkyrium_block.get());
        this.dropSelf(ModBlocks.Deepslate_plutosteel_ORE.get());
        this.dropSelf(ModBlocks.Deepslate_valkyrium_ORE.get());


        this.add(ModBlocks.plutosteel_ORE.get(),
                block -> createOreDropsModded(ModBlocks.plutosteel_ORE.get(), ModItems.MOLTEN_PLUTOSTEEL.get()) );
        this.add(ModBlocks.Deepslate_plutosteel_ORE.get(),
                block -> createDeepslateOreDropsModded(ModBlocks.Deepslate_plutosteel_ORE.get(), ModItems.MOLTEN_PLUTOSTEEL.get()) );
        this.add(ModBlocks.valkyrium_ORE.get(),
                block -> createOreDropsModded(ModBlocks.valkyrium_ORE.get(), ModItems.MOLTEN_PLUTOSTEEL.get()) );
        this.add(ModBlocks.Deepslate_valkyrium_ORE.get(),
                block -> createDeepslateOreDropsModded(ModBlocks.Deepslate_valkyrium_ORE.get(), ModItems.MOLTEN_PLUTOSTEEL.get()) );


    }

    protected LootTable.Builder createOreDropsModded(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createDeepslateOreDropsModded(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
