package com.delegate;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Waiter {
    Cook cook;

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public void cook(){
        cook.cook();
    }
}

