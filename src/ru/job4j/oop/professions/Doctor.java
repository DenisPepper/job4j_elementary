package ru.job4j.oop.professions;

import ru.job4j.oop.Ball;

public class Doctor extends Profession {
    public String specialization;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void treatIllnesses() {
    }
}
