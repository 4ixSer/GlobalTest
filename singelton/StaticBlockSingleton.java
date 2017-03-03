package com.singelton;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by qny4i on 01.03.2017.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    public String name;

    private StaticBlockSingleton(){
        name="Vasa";
    }

    static {
        try{
            instance=new StaticBlockSingleton();

        }catch (Exception e){
            e.getMessage();
        }

    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        StaticBlockSingleton singleton = getInstance();
        StaticBlockSingleton singleton2 = getInstance();
        System.out.println(singleton.name);
        System.out.println(singleton2.name);

        LazySingelton singelton3 =LazySingelton.getInstance();
        System.out.println(singelton3.name);
        LazySingelton singelton4 =LazySingelton.getInstance();
        System.out.println(singelton3.name);

    }
}
