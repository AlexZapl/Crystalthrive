package net.alexzapl.crystalthrive.item;

import net.alexzapl.crystalthrive.Crystalthrive;
import net.alexzapl.crystalthrive.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Crystalthrive.MODID);

    public static final Supplier<CreativeModeTab> CRYSTALLIC_BLOCKS = CREATIVE_MODE_TAB.register("crystallic_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModBlocks.CRYSTALLIC_REDSTONE_BLOCK.get())))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Crystalthrive.MODID, "crystallic_items_tab"))
                    .title(Component.translatable("creativetab.crystalthrive.crystallic_blocks"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CRYSTALLIZER);
                        output.accept(ModBlocks.CRYSTALLIC_LAPIS_BLOCK);
                        output.accept(ModBlocks.CRYSTALLIC_COAL_BLOCK);
                        output.accept(ModBlocks.CRYSTALLIC_REDSTONE_BLOCK);
                        output.accept(ModBlocks.CRYSTALLIC_PRISMARINE_BLOCK);
                        output.accept(ModBlocks.CRYSTALLIC_QUARTZ_BLOCK);
                        output.accept(ModBlocks.CRYSTALLIC_GLOWSTONE_BLOCK);
                    })).build());

    public static final Supplier<CreativeModeTab> CRYSTALLIC_ITEMS = CREATIVE_MODE_TAB.register("crystallic_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.CRYSTALLIC_CORE.get())))
                    .title(Component.translatable("creativetab.crystalthrive.crystallic_items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CRYSTALLIC_CORE);
                        output.accept(ModItems.CRYSTALLIC_COAL);
                        output.accept(ModItems.CRYSTALLIC_GLOWSTONE);
                        output.accept(ModItems.CRYSTALLIC_PRISMARINE);
                        output.accept(ModItems.CRYSTALLIC_LAPIS);
                        output.accept(ModItems.CRYSTALLIC_QUARTZ);
                        output.accept(ModItems.CRYSTALLIC_REDSTONE);
                    })).build());

    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
