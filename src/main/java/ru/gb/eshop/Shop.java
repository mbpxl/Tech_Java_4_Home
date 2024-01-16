package ru.gb.eshop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Good> goodList = new ArrayList<>();
    public static List<Order> orderList = new ArrayList<>();

    public static Order makeOrder (Customer customer, Good good, int quantity) {
        try {
            if (!customerList.contains(customer)) {
                throw new CustomerException();
            } else if (!goodList.contains(good)) {
                throw new ProductException();
            } else if ((quantity <= 0) || (quantity > goodList.size())){
                throw new AmountException();
            }
            return new Order(customer, good, quantity);
        } catch (CustomerException e) {
            System.err.println(e.getMessage());
        } catch (ProductException e) {
            System.err.println("Товара не существует!");
        } catch (AmountException e) {
            System.err.println("Количество задано не корректно!");
        }
        return null;
    }
}
