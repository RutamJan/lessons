package io.jancorp.fitness;

import java.time.LocalDate;

public class Client {
    private String name;
    private String surname;
    private int year;


    public Client(String name, String surname, int year) {
        setName(name);
        setSurname(surname);
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null != name)   {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (null != name) {
            this.surname = surname;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= LocalDate.now().getYear() - 100 && year <= LocalDate.now().getYear() - 18) {
            this.year = year;
        }
    }
}
