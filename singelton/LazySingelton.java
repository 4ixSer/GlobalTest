package com.singelton;

/**
 * Created by qny4i on 01.03.2017.
 */
public class LazySingelton {
    private static LazySingelton instance;
    public String name = "saf";

    private LazySingelton(){}

    public static LazySingelton getInstance(){
        if(instance==null)
            instance=new LazySingelton();
        return instance;
    }
}
