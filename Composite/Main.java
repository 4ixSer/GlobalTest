package com.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qny4i on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Figure circle1 =new Circle("круг 1");
        Figure circle2 =new Circle("круг 2");
        Figure circle3 =new Circle("круг 3");
        Figure circle4 =new Circle("круг 4");
        Figure circle5 =new Circle("круг 5");
        Figure circle6 =new Circle("круг 6");
        Figure square1 =new Square("Квадрат 1");
        Figure square2 =new Square("Квадрат 2");
        Figure square3 =new Square("Квадрат 3");
        Figure square4 =new Square("Квадрат 4");
        Figure triangle1 =new Triangle("Трекугольник 1");
        Figure triangle2 =new Triangle("Трекугольник 2");
        Figure triangle3 =new Triangle("Трекугольник 3");
        Figure triangle4 =new Triangle("Трекугольник 4");
        Figure triangle5 =new Triangle("Трекугольник 5");
        Figure triangle6 =new Triangle("Трекугольник 6");


        Composite composite1=new Composite("мешок 1");
        Composite composite2=new Composite("мешок 2");
        Composite composite3=new Composite("мешок 3");


        composite1.setList(circle2);
        composite1.setList(circle3);
        composite1.setList(circle6);
        composite1.setList(square1);
        composite1.setList(square3);
        composite1.setList(triangle1);
        composite1.setList(triangle4);

        composite2.setList(circle4);
        composite2.setList(square2);
        composite2.setList(triangle3);
        composite2.setList(triangle6);



        composite3.setList(triangle2);


        List<Figure> figureList = new ArrayList<>();
        figureList.add(composite1);
        figureList.add(composite2);
        figureList.add(composite3);
        figureList.add(circle1);
        figureList.add(circle5);
        figureList.add(square4);
        figureList.add(triangle5);


        for (Figure x :
                figureList) {
            x.drow();
        }







    }
}
