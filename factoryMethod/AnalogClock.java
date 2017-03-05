package com.factoryMethod;

/**
 * Created by qny4i on 03.03.2017.
 */
public class AnalogClock  implements Watch{
    @Override
    public void showTime() {
        System.out.println("    ");
        System.out.println("--* ");
        System.out.println("  | ");
    }
}
