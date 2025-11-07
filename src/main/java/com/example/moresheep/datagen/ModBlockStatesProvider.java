package com.example.moresheep.datagen;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

//方块状态
public class ModBlockStatesProvider extends BlockStateProvider {

    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreSheep.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.STAR_POINT_BLOCK.get(), cubeAll(ModBlocks.STAR_POINT_BLOCK.get()));
    }
}
