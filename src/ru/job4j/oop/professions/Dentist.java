package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    public String typeOfDentist;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void straightenTeeth() {
    }
}
