package com.earthmelon.mtbloodmagic;

import cpw.mods.fml.common.discovery.ASMDataTable;
import cpw.mods.fml.common.discovery.ContainerType;
import cpw.mods.fml.common.discovery.ModCandidate;

import java.io.File;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MainTest {
//    @Test
    public void testLogger() {
//        Main test = new Main();
        ASMDataTable ASM = new ASMDataTable();
        File classPathRoot = new File("C:\\Users\\player1\\curseforge\\minecraft\\Instances\\minetweakerfork\\libs\\HBM-NTM-.1.0.27_X5491_H261.jar");
        File modContainer = null;
        ModCandidate HBM = new ModCandidate(classPathRoot, modContainer, ContainerType.JAR);
        ASM.addASMData(HBM, "hello", "testclass", "testobject", new HashMap<String, Object>() {
        });
        System.out.println(ASM.getAll("hello"));

//        assertNotNull(test.logger(new FMLPreInitializationEvent(null)));
    }
}
