package com.darkwolfie.silentvalkyrie.item;

import com.darkwolfie.silentvalkyrie.Main;
import com.darkwolfie.silentvalkyrie.item.keys.TestPortakKeyItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> PlutoSteel = Items.register("plutosteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_PLUTOSTEEL = Items.register("molten_plutosteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_PLUTOSTEEL = Items.register("hardened_plutosteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TestKey = Items.register("testing_key", () -> new TestPortakKeyItem(new Item.Properties().durability(100).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus){
       Items.register(eventBus);
    }
}
