package ru.netology.HW_COLLECTIONS;

public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String name) {
        super("Player " + name + " is not registered.");
    }
}
