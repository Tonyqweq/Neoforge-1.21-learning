package com.example.moresheep.datagen;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.block.ModBlocks;
import com.example.moresheep.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, MoreSheep.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.STAR_POINT.get(), "星之点");
        add(ModBlocks.STAR_POINT_BLOCK.get(), "星之点块");
        add("itemGroup.sheep_tab","Mod");
    }
}
