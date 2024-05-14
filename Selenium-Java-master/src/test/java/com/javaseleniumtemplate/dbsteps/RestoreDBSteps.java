package com.javaseleniumtemplate.dbsteps;

import java.io.IOException;

public class RestoreDBSteps {

    private static String restorePath = System.getProperty("user.dir")+ "/src/test/java/com/javaseleniumtemplate/queries/";

    public static void restoreDB(){
        try{
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("cmd /c start " + restorePath + "restore.bat");
        }
        catch(IOException ioException){
            System.out.println("File not found");
        }
    }
}