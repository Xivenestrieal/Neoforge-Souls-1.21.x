package net.xivenestriealsilver.soulsmod.datagen;

import net.xivenestriealsilver.soulsmod.SoulsMod;
import net.xivenestriealsilver.soulsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SoulsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.LAZURITE_INGOT.get());
        basicItem(ModItems.RAW_LAZURITE.get());

        basicItem(ModItems.HOGYOKU_SOUL.get());
        basicItem(ModItems.CORRUPTED_SOUL.get());

        basicItem(ModItems.FROZEN_FLAME.get());
        basicItem(ModItems.ROOT_HEART.get());
        basicItem(ModItems.ENT_CHARCOAL.get());

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.SEEKING_EYES.get());
        basicItem(ModItems.LAZURITE_KEY.get());
    }
}