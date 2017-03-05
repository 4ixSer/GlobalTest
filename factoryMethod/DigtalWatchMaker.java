package com.factoryMethod;

/**
 * Created by qny4i on 03.03.2017.
 */
public class DigtalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
