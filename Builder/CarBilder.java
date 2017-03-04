package com.Builder;

/**
 * Created by qny4i on 04.03.2017.
 */
public abstract class CarBilder {
    Car car;


    void createCar(){car= new Car();}
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){return car;}
}
