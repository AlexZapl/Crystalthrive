package net.alexzapl.crystalthrive.block;

import net.alexzapl.crystalthrive.Crystalthrive;
import net.alexzapl.crystalthrive.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Crystalthrive.MODID);

    public static final DeferredBlock<Block> CRYSTALLIZER = registerBlock("crystallizer",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CRYSTALLIC_COAL_BLOCK = registerBlock("crystallic_coal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> CRYSTALLIC_REDSTONE_BLOCK = registerBlock("crystallic_redstone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> CRYSTALLIC_LAPIS_BLOCK = registerBlock("crystallic_lapis_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> CRYSTALLIC_PRISMARINE_BLOCK = registerBlock("crystallic_prismarine_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> CRYSTALLIC_QUARTZ_BLOCK = registerBlock("crystallic_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> CRYSTALLIC_GLOWSTONE_BLOCK = registerBlock("crystallic_glowstone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));


    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
