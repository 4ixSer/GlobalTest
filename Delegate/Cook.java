package com.Delegate;

/**
 * Created by qny4i on 04.03.2017.
 * Делегирование (англ. Delegation) — основной шаблон проектирования, в котором объект внешне выражает некоторое
 * поведение, но в реальности передаёт ответственность за выполнение этого поведения связанному объекту.
 * Шаблон делегирования является фундаментальной абстракцией, на основе которой реализованы другие шаблоны -
 * композиция (также называемая агрегацией), примеси (mixins) и аспекты (aspects).
 */
public interface Cook {
    public void cook();

}
