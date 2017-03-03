package com.observer;

/**
 * Created by qny4i on 03.03.2017.
 */
public class ConsolObserver implements Observen{
    @Override
    public void handleEvent(int x, int y) {
        System.out.println("Темпаратура и давление изменилось t="+ x+"; P="+y+";");
    }
}
