package org.example;

//исключение, возникающее при попытке создать прямоугольник с отрицательными размерами
public class InvalidDimensionException extends Exception {
    // конструктор создает новое исключение с заданным сообщением
    public InvalidDimensionException(String message) {
        super(message);
    }
}
