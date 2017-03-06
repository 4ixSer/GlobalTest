package com.chainResponsibility;

/**
 * Created by qny4i on 06.03.2017.
 */
public class SMSLogger extends Logger {
    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Отправить СМС с текстом "+ massage);
    }
}
