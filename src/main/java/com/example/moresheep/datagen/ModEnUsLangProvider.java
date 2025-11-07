package com.example.moresheep.datagen;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.block.ModBlocks;
import com.example.moresheep.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

//英文文本生成
public class ModEnUsLangProvider extends LanguageProvider {

    public ModEnUsLangProvider(PackOutput output) {
        super(output, MoreSheep.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.STAR_POINT.get(), "star point");


        add(ModBlocks.STAR_POINT_BLOCK.get(), "star point block");

        add("itemGroup.sheep_tab","Mod");
    }
}
