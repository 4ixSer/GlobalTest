package com.builder;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Renault extends CarBilder {
    @Override
    void buildMake() {
        car.setName("Renault");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(230);
    }
}
