package com.Composite;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Square implements Figure {
    public String name;

    Square(String name){
        this.name=name;
    }
    @Override
    public void drow() {
        System.out.println("я квадрат "+name);
    }
}
