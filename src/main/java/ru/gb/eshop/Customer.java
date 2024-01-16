package ru.gb.eshop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@ToString
public class Customer {
    private String lastName;
    private String firstName;
    private int age;
    private String phoneNumber;

    public enum Genders {
        MALE,
        FEMALE,
    }

    private String gender;



    public Customer(String lastName, String firstName, int age, String phoneNumber, Genders gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = String.valueOf(gender);
    }

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "lastName='" + lastName + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", age=" + age +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
}
