package com.siepert.createlegacy.util.compat.jei.recipe;

import com.siepert.createlegacy.CreateLegacyModData;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public abstract class AbstractPressingRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T> {
    protected static final ResourceLocation TEXTURES = new ResourceLocation(CreateLegacyModData.MOD_ID + ":textures/gui/singleton.png");

    protected static final int input = 0;
    protected static final int output = 1;

    public AbstractPressingRecipeCategory(IGuiHelper helper) {
    }
}
