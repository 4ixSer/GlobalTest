package com.observer;

import java.io.IOException;

/**
 * Created by qny4i on 03.03.2017.
 */
public interface Observable {
    public void addObserver(Observen observen);
    public void removeObserver(Observen observen);
    public void notifyObserver() throws IOException;
}
