package org.example;

//исключение, возникающее при попытке создать круг с отрицательным радиусом
public class InvalidRadiusException extends Exception {
    public InvalidRadiusException(String message) {
        super(message);
    }
}