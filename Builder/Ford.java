package com.Builder;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Ford extends CarBilder {
    @Override
    void buildMake() {
        car.setName("Ford");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(123);
    }
}
