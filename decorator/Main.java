package com.decorator;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        PrintInterface printer =new QuotesDecorator(new LeftDecorator(new Printer("Чет печатаю")));

        printer.print();
    }
}
