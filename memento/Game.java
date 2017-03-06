package com.memento;

/**
 * Created by qny4i on 06.03.2017.
 */
public class Game {
    public String nameLvl;
    public int score;
    public String item;

    public Game(String nameLvl, int score, String item) {
        this.nameLvl = nameLvl;
        this.score = score;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Игрок " +
                "на уровне'" + nameLvl + '\'' +
                ", со счетом" + score +
                ", в руха у него " + item + '\'' +
                '}';
    }

    public String getNameLvl() {
        return nameLvl;
    }
    public void setNameLvl(String nameLvl) {
        this.nameLvl = nameLvl;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public Save save(){
        return  new Save(nameLvl,score,item);
    }

    public void load(Save save){
        setItem(save.item);
        setNameLvl(save.nameLvl);
        setScore(save.score);
    }
}
