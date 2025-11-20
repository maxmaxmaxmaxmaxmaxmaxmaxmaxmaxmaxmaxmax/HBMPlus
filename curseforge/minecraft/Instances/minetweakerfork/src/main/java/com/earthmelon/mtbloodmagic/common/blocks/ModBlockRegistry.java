package com.earthmelon.mtbloodmagic.common.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockRegistry {

    // Used to retrieve the object once it is created
    public static final Block BlockEvilDirt = GameRegistry.registerBlock(Block.getBlockById(1), "EvilDirt");

}
