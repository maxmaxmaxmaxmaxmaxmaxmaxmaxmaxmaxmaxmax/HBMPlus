package com.earthmelon.mtbloodmagic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.earthmelon.mtbloodmagic.ReadMCModInfo;

import java.io.IOException;
import java.util.HashMap;

public class ReadMCModInfoTest {
    public static HashMap<ReadMCModInfo.McModInfo, String> setUp() {
        HashMap<ReadMCModInfo.McModInfo, String> tested  = null;
        try {
            tested = ReadMCModInfo.readFile("src\\main\\resources\\mcmod.info");
        } catch (IOException e) {
            // fails
            System.out.println("mcmod.info does not exist!");
            assertTrue(false);
        } return tested;
    }

    @Test
    public void testReadModInfo() {
        HashMap<ReadMCModInfo.McModInfo, String> tested = ReadMCModInfoTest.setUp();
        assertNotNull(tested);
        assertEquals("mtbloodmagicfork", tested.get(ReadMCModInfo.McModInfo.MODID));
        assertEquals("MineTweaker Blood Magic Addon", tested.get(ReadMCModInfo.McModInfo.NAME));
        assertEquals("1.0.0", tested.get(ReadMCModInfo.McModInfo.VERSION));
        assertEquals("1.7.10", tested.get(ReadMCModInfo.McModInfo.MCVERSION));
        assertEquals("earthmelon", tested.get(ReadMCModInfo.McModInfo.AUTHORLIST));
        // TODO: Add other fields when they have entries
    }
}
