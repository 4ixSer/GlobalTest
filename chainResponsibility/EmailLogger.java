package com.chainResponsibility;

/**
 * Created by qny4i on 06.03.2017.
 */
public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Отправили Email с текстом "+massage);
    }
}
