package net.xivenestriealsilver.soulsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.xivenestriealsilver.soulsmod.SoulsMod;
import net.xivenestriealsilver.soulsmod.block.ModBlocks;
import net.xivenestriealsilver.soulsmod.block.custom.LazuriteLampBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SoulsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LAZURITE_BLOCK);
        blockWithItem(ModBlocks.LAZURITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LAZURITE_ORE);
        blockWithItem(ModBlocks.SEEKING_BLOCK);

        customLamp();
    }

    private void customLamp() {
        getVariantBuilder(ModBlocks.LAZURITE_LAMP.get()).forAllStates(state -> {
            if (state.getValue(LazuriteLampBlock.CLICKED)) {
                return new ConfiguredModel[]{
                        new ConfiguredModel(models().cubeAll("lazurite_lamp_on",
                                ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "block/lazurite_lamp_on")))
                };
            } else {
                return new ConfiguredModel[]{
                        new ConfiguredModel(models().cubeAll("lazurite_lamp_off",
                                ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "block/lazurite_lamp_off")))
                };
            }
        });
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
