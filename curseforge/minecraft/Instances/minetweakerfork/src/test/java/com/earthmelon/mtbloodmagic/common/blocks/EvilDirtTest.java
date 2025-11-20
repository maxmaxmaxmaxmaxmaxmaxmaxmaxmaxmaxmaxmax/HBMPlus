package com.earthmelon.mtbloodmagic.common.blocks;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import org.junit.Test;

public class EvilDirtTest {
    @Test
    public void test() {
        EvilDirt dirt = new EvilDirt(Blocks.dirt.getMaterial());
        System.out.println(Block.getIdFromBlock(dirt));
    }
}
