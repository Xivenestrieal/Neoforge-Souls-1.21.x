package net.xivenestriealsilver.soulsmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xivenestriealsilver.soulsmod.SoulsMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SoulsMod.MOD_ID);

    public static final DeferredItem<Item> RAW_LUMINOUS = ITEMS.register("raw_luminous",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> LUMINOUS_INGOT = ITEMS.register("luminous_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LUMINOUS_KEY = ITEMS.register("luminous_key",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SEARCHING_EYES = ITEMS.register("searching_eyes",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
