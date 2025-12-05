package net.xivenestriealsilver.soulsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xivenestriealsilver.soulsmod.SoulsMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoulsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> GATE_KEYS_TAB = CREATIVE_MODE_TAB.register("gate_keys_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.LUMINOUS_KEY.get()))
                    .title(Component.translatable("creativetab.soulsmod.gate_keys"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LUMINOUS_KEY);
                    }).build());


    public static final Supplier<CreativeModeTab> SOUL_FRAGMENTS_TAB = CREATIVE_MODE_TAB.register("soul_fragments_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.HOGYOKU_SOUL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "gate_keys_tab"))
                    .title(Component.translatable("creativetab.soulsmod.soul_fragments"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HOGYOKU_SOUL);
                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
