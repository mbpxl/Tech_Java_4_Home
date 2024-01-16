package ru.gb;

import lombok.Getter;
import ru.gb.eshop.Customer;
import ru.gb.eshop.Good;
import ru.gb.eshop.Holidays;
import ru.gb.eshop.Shop;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static Boolean isCorrect(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException();
            } else if ((password.length() >= 20) || (!password.equals(confirmPassword))) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            System.err.println("Неверный логин! " + e);
            return false;
        } catch (WrongPasswordException e) {
            System.err.println("Длина пароля слишком большая или пароли не совпадают! " + e);
            return false;
        }
        return true;
    }

    public static void getCongratulations(Customer[] customers) {
      LocalDate currentDay = LocalDate.now();
        for (int i = 0; i < customers.length; i++) {
          String currentCustomerGender = customers[i].getGender();

          if ((currentCustomerGender == "FEMALE") && (currentDay == Holidays.WOMEN_DAY.getHoliday())) {
            System.out.println("С Международным Женским Днём!");
          } else if ((currentCustomerGender == "MALE") && (currentDay == Holidays.MENS_DAY.getHoliday())) {
            System.out.println("С Днём Защитника отечества!");
          } else if (currentDay == Holidays.NEW_YEAR.getHoliday()) {
            System.out.println("С Новым Годом!");
          }
        }
    }

    public static void main(String[] args) {
        Customer Andrey = new Customer("Andrey", "Lohov", 44, "9-339-99", Customer.Genders.MALE);
        Shop.customerList.add(Andrey);

        Customer Sergey = new Customer("Sergey", "Antonov", 23, "1-23-33", Customer.Genders.MALE);
        Shop.customerList.add(Sergey);

        Good toy1 = new Good("Toy", 1000.99);
        Shop.goodList.add(toy1);
        Good toy2 = new Good("Toy", 1000.99);
        Shop.goodList.add(toy2);
        Good toy3 = new Good("Toy", 1000.99);
        Shop.goodList.add(toy3);
        Good toy4 = new Good("Toy", 1000.99);
        Shop.goodList.add(toy4);
        Good toy5 = new Good("Toy", 1000.99);
        Shop.goodList.add(toy5);

        Customer[] customers = {new Customer("Eskov", "Egor", 12, "222", Customer.Genders.MALE)};

        getCongratulations(customers);
    }
}