package com.earthmelon.mtbloodmagic;

import com.earthmelon.mtbloodmagic.common.blocks.EvilDirt;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;

import java.util.ArrayList;
import java.util.List;

import static cpw.mods.fml.common.registry.GameRegistry.registerBlock;


@Mod(modid = MTBloodMagic.MODID, useMetadata = true)
public class MTBloodMagic {
    public static final String MODID = "mtbloodmagicaddon";

    @EventHandler
    public void createRecipes(FMLPreInitializationEvent event) {
        Block evilDirt = registerBlock(new EvilDirt(Blocks.dirt.getMaterial()), "evil_dirt");
        evilDirt.setBlockName("evil_dirt");
        List<Block> recipeItems = new ArrayList<Block>();
        recipeItems.add(Blocks.dirt);
        ItemStack itemStack = new ItemStack(new EvilDirt(Blocks.dirt.getMaterial()));
        IRecipe evilDirtRecipe = new ShapelessRecipes(itemStack, recipeItems);
        Object[] oneDirt = {Blocks.dirt};
        GameRegistry.addShapelessRecipe(itemStack, oneDirt);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}

