package ru.gb.eshop;

public class CustomerException extends Exception{

    public CustomerException() {
    }

    public CustomerException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Покупателя не существует!";
    }
}
