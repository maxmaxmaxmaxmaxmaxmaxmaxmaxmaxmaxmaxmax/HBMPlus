package com.earthmelon.mtbloodmagic.common.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

public class ModBlockRegistry {

    // Used to retrieve the object once it is created
    public static void registerDefaults() {
        Block BlockEvilDirt = GameRegistry.registerBlock(new EvilDirt(Blocks.dirt.getMaterial()), "evilDirt");
        BlockEvilDirt.setBlockName("evilDirt");
    }

}
