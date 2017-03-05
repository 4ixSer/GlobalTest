package com.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Composite implements Figure {
    public String name;
    @Override
    public void drow() {
        System.out.println ("Пакет по имени "+ name);
        for (Figure a: figureList
             ) {

           a.drow();
        }
        System.out.println();
    }

    public Composite(String name) {
        this.name = name;
    }

    private List<Figure> figureList = new  ArrayList<>();

    public void setList(Figure newFigure){
        figureList.add(newFigure);
    }

}
