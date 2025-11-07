package com.example.moresheep.item;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreSheep.MODID);


    public static final Supplier<CreativeModeTab> TUTORIAL_TAB =
            CREATIVE_MODE_TABS.register("tutorial_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.STAR_POINT.get()))
                    .title(Component.translatable("itemGroup.sheep_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.STAR_POINT);
                        output.accept(ModBlocks.STAR_POINT_BLOCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
