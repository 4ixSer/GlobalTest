package com.Delegate;

import java.util.Currency;

/**
 * Created by qny4i on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Waiter waiter1  =new Waiter();
        waiter1.setCook(new Minestrone());
        waiter1.cook();

    }
}
