package ru.job4j.oop.professions;

import ru.job4j.oop.Ball;

public class Doctor extends Profession {
    public String specialization;

    public Doctor(String name, String surname, String education, String birthday, String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public void treatIllnesses() {
    }
}
