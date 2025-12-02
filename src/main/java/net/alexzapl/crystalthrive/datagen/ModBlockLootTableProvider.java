package net.alexzapl.crystalthrive.datagen;

import net.alexzapl.crystalthrive.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate(){
        dropSelf(ModBlocks.CRYSTALLIZER.get());
        dropSelf(ModBlocks.CRYSTALLIC_COAL_BLOCK.get());
        dropSelf(ModBlocks.CRYSTALLIC_PRISMARINE_BLOCK.get());
        dropSelf(ModBlocks.CRYSTALLIC_QUARTZ_BLOCK.get());
        dropSelf(ModBlocks.CRYSTALLIC_GLOWSTONE_BLOCK.get());
        dropSelf(ModBlocks.CRYSTALLIC_REDSTONE_BLOCK.get());
        dropSelf(ModBlocks.CRYSTALLIC_LAPIS_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
