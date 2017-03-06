package com.state;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Radio {
    public RadioState radioState;

    public void setRadioState(RadioState radioState) {
        this.radioState = radioState;
    }

    public void someMetod(){
        radioState.someMethod();
    }
}
