package com.builder;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Car {
    public String name;
    public int maxSpeed;
    public Transmission transmission;

    public void setName(String name) {
        this.name = name;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", transmission=" + transmission +
                '}';
    }
}


