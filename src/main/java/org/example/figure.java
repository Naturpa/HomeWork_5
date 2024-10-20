package org.example;

//интерфейс, описывающий общие методы для всех фигур
public interface figure {
    double area(); //вычисляет площадь фигуры
    double perimeter(); //вычисляет периметр фигуры
    String toString(); //возвращает строковое представление фигуры
}