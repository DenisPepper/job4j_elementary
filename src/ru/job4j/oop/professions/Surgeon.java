package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    public String typeOfSurgery;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void usingSurgery() {
    }
}
