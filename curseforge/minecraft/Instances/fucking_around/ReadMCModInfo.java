package com.earthmelon.mtbloodmagic;

import scala.tools.nsc.Global;

import java.io.*;
import java.util.HashMap;

public class ReadMCModInfo {
    public enum McModInfo {
        MODID,
        NAME,
        DESCRIPTION,
        VERSION,
        MCVERSION,
        URL,
        UPDATEURL,
        AUTHORLIST,
        CREDITS,
        LOGOFILE,
        SCREENSHOTS,
        DEPENDENCIES
    }

    public static HashMap<McModInfo, String> readFile(String path) {
        File myObj = new File(path);
        HashMap<McModInfo, String> output = new HashMap<McModInfo, String>();
        McModInfo[] inputs = {McModInfo.MODID, McModInfo.NAME, McModInfo.DESCRIPTION, McModInfo.VERSION,
                                McModInfo.MCVERSION, McModInfo.URL, McModInfo.UPDATEURL, McModInfo.AUTHORLIST,
                                McModInfo.CREDITS, McModInfo.LOGOFILE, McModInfo.SCREENSHOTS, McModInfo.DEPENDENCIES};
        FileReader mcFileReader = null;
        int lineNumber = -2; // removes the first two lines from the check.
        try {
            mcFileReader = new FileReader(myObj);
        } catch (FileNotFoundException e) {
            System.out.println("mcmod.info file does not exist!");
            e.printStackTrace();
        }
        assert mcFileReader != null;
        BufferedReader myReader = new BufferedReader(mcFileReader);
        for (String line = myReader.readLine(); line != null; line = myReader.readLine()) {
            if (line.contains(":")) {
                String cleanLine = line.substring(line.indexOf(":") + 3);
                String toRemove = "[\"\\[\\],]"; // regex
                cleanLine = cleanLine.replaceAll(toRemove, "");
                output.put(inputs[lineNumber], cleanLine);
            }
            lineNumber++;
        }
        myReader.close();
        return output;
    }
}
