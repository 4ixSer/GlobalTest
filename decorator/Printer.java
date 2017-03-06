package com.decorator;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Printer  implements PrintInterface{
    public String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
