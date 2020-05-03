package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    public String typeOfDentist;

    public Dentist(String name, String surname, String education, String birthday, String specialization, String typeOfDentist) {
        super(name, surname, education, birthday, specialization);
        this.typeOfDentist = typeOfDentist;
    }

    public void straightenTeeth() {
    }
}
