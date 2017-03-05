package com.adapter;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Volt120 sad = new Adapter220to120();
        sad.powerCurrent();
        Volt220 ad = new Volt220();
        ad.powerCurrentAC();
        Volt120 sadq =new Volt120() {
            @Override
            public void powerCurrent() {
                System.out.println("Питание устройств 120 вольт");
            }
        };
        sadq.powerCurrent();
    }
}
