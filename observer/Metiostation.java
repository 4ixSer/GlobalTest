package com.observer;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qny4i on 03.03.2017.
 */
public class Metiostation implements Observable {
    int temperature;
    int pressure;

    List<Observen> observenList = new LinkedList<>();

    public void setAll(int temperature,int pressure){
        this.temperature=temperature;
        this.pressure=pressure;

            notifyObserver();

    }


    @Override
    public void addObserver(Observen observen) {
        observenList.add(observen);
    }

    @Override
    public void removeObserver(Observen observen) {
        observenList.remove(observen);
    }

    @Override
    public void notifyObserver()  {
        for (Observen a:
                observenList) {
            a.handleEvent(temperature,pressure);

        }
    }
}
