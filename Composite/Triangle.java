package com.Composite;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Triangle implements Figure {
    public String name;

    Triangle(String name){
        this.name=name;
    }
    @Override
    public void drow() {
        System.out.println("я треугольник "+name);
    }
}
