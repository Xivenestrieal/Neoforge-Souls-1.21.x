package net.xivenestriealsilver.soulsmod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.xivenestriealsilver.soulsmod.SoulsMod;
import net.xivenestriealsilver.soulsmod.block.ModBlocks;

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
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
