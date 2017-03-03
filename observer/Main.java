package com.observer;

/**
 * Created by qny4i on 03.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Metiostation met1= new Metiostation();
        met1.addObserver(new ConsolObserver());
        met1.addObserver(new FileObserver());

        met1.setAll(17,156);
        met1.setAll(-7,256);
    }
}
