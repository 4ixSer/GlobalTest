package com.FactoryMethod;

/**
 * Created by qny4i on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        WatchMaker factory =  new DigtalWatchMaker();
        Watch watch = factory.createWatch();
        ///sdfghj
    }
}
