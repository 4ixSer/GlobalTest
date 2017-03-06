package com.chainResponsibility;

/**
 * Created by qny4i on 06.03.2017.
 */
public class ConsolLogger extends Logger{
    public ConsolLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Выводим ошибку в консоль "+massage );
    }
}
