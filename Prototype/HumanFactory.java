package com.Prototype;

/**
 * Created by qny4i on 05.03.2017.
 */
public class HumanFactory implements Factory{
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    @Override
    public Object copy() {

        Human copyHuman =(Human) human.copy();
        return copyHuman;
    }
}
