package com.example.moresheep.datagen;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

//物品模型
public class ModItemModelsProvider extends ItemModelProvider {

    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreSheep.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.STAR_POINT.get());
    }
}
