package org.example;

//исключение, возникающее при попытке создать цилиндр с отрицательной высотой
public class InvalidHeightException extends Exception {
    public InvalidHeightException(String message) {
        super(message);
    }
}