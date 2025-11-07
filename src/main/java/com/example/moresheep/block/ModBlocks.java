package com.example.moresheep.block;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks  {
    public static final DeferredRegister.Blocks BLOCKS=DeferredRegister.createBlocks(MoreSheep.MODID);

    private static <T extends Block> void registerBlockItems(String name,DeferredBlock<T> block){
        ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static final DeferredBlock<Block> STAR_POINT_BLOCK =
            registerBlock("star_point_block",()->new Block(BlockBehaviour.Properties.of().strength(3.0f,3.0f)));


}
