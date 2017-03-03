package com.singelton;

/**
 * Created by qny4i on 01.03.2017.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    public String name = "saf";

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null)
            instance=new ThreadSafeSingleton();
        return instance;
    }
}
