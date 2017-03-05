package com.adapter;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Adapter220to120 extends Volt220 implements Volt120 {

    @Override
    public void powerCurrent() {
        System.out.print( "перходник ");
        powerCurrentAC();
    }
}
