package com.decorator;

/**
 * Created by qny4i on 06.03.2017.
 */
public class RightDecorator extends Decorator implements PrintInterface {

    public RightDecorator(PrintInterface component) {
        super(component);
    }

    @Override
    public void print() {

        component.print();
        System.out.print("*");
    }
}
