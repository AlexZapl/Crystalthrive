package net.alexzapl.crystalthrive.datagen;

import net.alexzapl.crystalthrive.Crystalthrive;
import net.alexzapl.crystalthrive.block.ModBlocks;
import net.alexzapl.crystalthrive.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, Crystalthrive.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels(){
        basicItem(ModItems.CRYSTALLIC_CORE.get());

        basicItem(ModItems.CRYSTALLIC_COAL.get());
        basicItem(ModItems.CRYSTALLIC_PRISMARINE.get());
        basicItem(ModItems.CRYSTALLIC_QUARTZ.get());
        basicItem(ModItems.CRYSTALLIC_GLOWSTONE.get());
        basicItem(ModItems.CRYSTALLIC_REDSTONE.get());
        basicItem(ModItems.CRYSTALLIC_LAPIS.get());
    }
}
