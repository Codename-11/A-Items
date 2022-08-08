package net.axiomlabs.aitems.item;

import net.axiomlabs.aitems.aitems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, aitems.MOD_ID);

    public static final RegistryObject<Item> axiom = ITEMS.register( "axiom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AITEMS_TAB)));

    public static final RegistryObject<Item> raw_axiom = ITEMS.register( "raw_axiom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AITEMS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
