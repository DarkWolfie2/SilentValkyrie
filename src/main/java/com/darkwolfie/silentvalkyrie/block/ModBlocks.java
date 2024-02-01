package com.darkwolfie.silentvalkyrie.block;

import com.darkwolfie.silentvalkyrie.Main;
import com.darkwolfie.silentvalkyrie.block.portals.TestPortalBlock;
import com.darkwolfie.silentvalkyrie.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> plutosteel_ORE = registerBlock("plutosteel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Deepslate_plutosteel_ORE = registerBlock("deepslate_plutosteel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> Deepslate_valkyrium_ORE = registerBlock("deepslate_valkyrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> valkyrium_ORE = registerBlock("valkyrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> valkyrium_block = registerBlock("valkyrium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> plutosteel_block = registerBlock("plutosteel_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TestPortalBlock = registerBlock("testportalblock",
            () -> new TestPortalBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).noCollission()));

    public static final RegistryObject<Block> Deepslate_huskyrium_ORE = registerBlock("deepslate_huskyrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> huskyrium_ORE = registerBlock("huskyrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> huskyrium_block = registerBlock("huskyrium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Deepslate_graphinium_ORE = registerBlock("deepslate_graphinium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> graphinium_ORE = registerBlock("graphinium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> graphinium_block = registerBlock("graphinium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Deepslate_cryptonium_ORE = registerBlock("deepslate_cryptonium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> cryptonium_ORE = registerBlock("cryptonium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> cryptonium_block = registerBlock("cryptonium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(3f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
