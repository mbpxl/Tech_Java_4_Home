package ru.gb.eshop;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private Customer customer;
    private Good good;

    private int quantity; // количество товара;

    public Order(Customer customer, Good good, int quantity) {
        this.customer = customer;
        this.good = good;
        this.quantity = quantity;
    }
}
