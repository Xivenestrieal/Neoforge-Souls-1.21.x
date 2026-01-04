package net.xivenestriealsilver.soulsmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xivenestriealsilver.soulsmod.SoulsMod;
import net.xivenestriealsilver.soulsmod.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SoulsMod.MOD_ID);

    public static final DeferredItem<Item> RAW_LAZURITE = ITEMS.register("raw_lazurite",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> LAZURITE_INGOT = ITEMS.register("lazurite_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CORRUPTED_SOUL = ITEMS.register("corrupted_soul",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> LAZURITE_KEY = ITEMS.register("lazurite_key",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SEARCHING_EYES = ITEMS.register("searching_eyes",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HOGYOKU_SOUL = ITEMS.register("hogyoku_soul",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ROOT_HEART = ITEMS.register("root_heart",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROOT_HEART)));

    public static final DeferredItem<Item> ENT_CHARCOAL = ITEMS.register("ent_charcoal",
            () -> new FuelItem(new Item.Properties(), 2000));

    public static final DeferredItem<Item> FROZEN_FLAME = ITEMS.register("frozen_flame",
            () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
