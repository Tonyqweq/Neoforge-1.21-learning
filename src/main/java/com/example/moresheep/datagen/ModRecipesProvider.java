package com.example.moresheep.datagen;

import com.example.moresheep.MoreSheep;
import com.example.moresheep.block.ModBlocks;
import com.example.moresheep.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

//配方
public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
//        oreBlasting(recipeOutput, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.25f, 100, "ice_ether");
//        oreSmelting(recipeOutput, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.25f, 200, "ice_ether");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STAR_POINT_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STAR_POINT)
                .unlockedBy(getHasName(ModItems.STAR_POINT), has(ModItems.STAR_POINT))
                .save(recipeOutput);
    }

    public static final List<ItemLike> ICE_ETHER = List.of();

    protected static void oreSmelting(
            RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.SMELTING_RECIPE,
                SmeltingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_smelting"
        );
    }

    protected static void oreBlasting(
            RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.BLASTING_RECIPE,
                BlastingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_blasting"
        );
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput recipeOutput,
            RecipeSerializer<T> serializer,
            AbstractCookingRecipe.Factory<T> recipeFactory,
            List<ItemLike> ingredients,
            RecipeCategory category,
            ItemLike result,
            float experience,
            int cookingTime,
            String group,
            String suffix
    ) {
        for (ItemLike itemlike : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, result, experience, cookingTime, serializer, recipeFactory)
                    .group(group)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MoreSheep.MODID + ":" + getItemName(result) + suffix + "_" + getItemName(itemlike));
        }
    }
}
