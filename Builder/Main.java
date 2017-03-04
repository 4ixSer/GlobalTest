package com.Builder;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBilder(new Renault());

        Car car =director.BuildCar();
        System.out.println(car);
    }
}
