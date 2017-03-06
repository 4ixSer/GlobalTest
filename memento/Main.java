package com.memento;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game("В жерле вулкана",123,"Рунический мечь");
        System.out.println(game);
        Save save1 =game.save();


        game.setItem("сломаная дубинка");
        game.setNameLvl("дом лесоруба");
        game.setScore(23123);


        System.out.println(game);
        System.out.println("load");
        game.load(save1);
        System.out.println(game);
    }
}

