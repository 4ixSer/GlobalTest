package com.observer;

import java.io.*;

/**
 * Created by qny4i on 03.03.2017.
 */
public class FileObserver implements Observen{
    File newFile = new File("src/com/observer/File.txt");

    @Override
    public void handleEvent(int x, int y)  {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(newFile);
            writer.print("Темпаратура и давление изменилось t="+ x+"; P="+y+";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
