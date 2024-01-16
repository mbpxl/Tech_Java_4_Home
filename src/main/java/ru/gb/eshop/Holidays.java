package ru.gb.eshop;

import lombok.Getter;
import lombok.ToString;


@ToString
public enum Holidays {
    NEW_YEAR("01.01"),
    WOMEN_DAY("08.03"),
    MENS_DAY("23.02");

    private String date;

    Holidays(String date) {
        this.date = date;
    }

    public String getHoliday() {
        return date;
    }
}
