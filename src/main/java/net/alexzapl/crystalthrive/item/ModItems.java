package net.alexzapl.crystalthrive.item;

import net.alexzapl.crystalthrive.Crystalthrive;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Crystalthrive.MODID);

    public static final DeferredItem<Item> CRYSTALLIC_CORE = ITEMS.register("crystallic_core",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLIC_COAL = ITEMS.register("crystallic_coal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLIC_REDSTONE = ITEMS.register("crystallic_redstone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLIC_LAPIS = ITEMS.register("crystallic_lapis",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLIC_PRISMARINE = ITEMS.register("crystallic_prismarine",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLIC_QUARTZ = ITEMS.register("crystallic_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLIC_GLOWSTONE = ITEMS.register("crystallic_glowstone",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
