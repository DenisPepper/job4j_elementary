package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    public String typeOfSurgery;

    public Surgeon(String name, String surname, String education, String birthday, String specialization) {
        super(name, surname, education, birthday, specialization);
    }

    public void usingSurgery() {
    }
}
