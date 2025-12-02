package net.alexzapl.crystalthrive.datagen;

import net.alexzapl.crystalthrive.Crystalthrive;
import net.alexzapl.crystalthrive.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, Crystalthrive.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.CRYSTALLIZER);

        blockWithItem(ModBlocks.CRYSTALLIC_COAL_BLOCK);
        blockWithItem(ModBlocks.CRYSTALLIC_PRISMARINE_BLOCK);
        blockWithItem(ModBlocks.CRYSTALLIC_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.CRYSTALLIC_GLOWSTONE_BLOCK);
        blockWithItem(ModBlocks.CRYSTALLIC_REDSTONE_BLOCK);
        blockWithItem(ModBlocks.CRYSTALLIC_LAPIS_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
