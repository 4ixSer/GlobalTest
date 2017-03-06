package com.decorator;

/**
 * Created by qny4i on 06.03.2017.
 */
public abstract class  Decorator  implements PrintInterface{
    PrintInterface component;

    public Decorator(PrintInterface component) {
        this.component = component;
    }
}
