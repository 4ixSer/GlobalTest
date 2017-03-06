package com.decorator;

/**
 * Created by qny4i on 06.03.2017.
 */
public class LeftDecorator extends Decorator implements PrintInterface{

    public LeftDecorator(PrintInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("*");
        component.print();

    }

}
