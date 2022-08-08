package net.axiomlabs.aitems.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AITEMS_TAB = new CreativeModeTab("aitems_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.axiom.get());
        }
    };
}
