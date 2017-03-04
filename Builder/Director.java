package com.Builder;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Director {
    CarBilder builder;
    void setBilder(CarBilder b){
        builder =b;}

    Car BuildCar(){
        builder.createCar();
        builder.buildMaxSpeed();
        builder.buildTransmission();
        builder.buildMake();
        return builder.getCar();
    }
}
