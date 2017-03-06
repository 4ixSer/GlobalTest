package com.state;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Radio radio =new Radio();
        radio.setRadioState(new OnStation());
        radio.someMetod();

        radio.setRadioState(new FindStation());
        radio.someMetod();

        radio.setRadioState(new RadioStatePlay());
        radio.someMetod();
    }
}
