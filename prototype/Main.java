package com.prototype;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human newHuman = new Human("Vasa", 21);
        Factory humanFactore = new HumanFactory(newHuman);
        Human copyHuman = (Human) humanFactore.copy();
        System.out.println(newHuman);
        System.out.println(copyHuman);
    }
}
