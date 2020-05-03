package ru.job4j.oop.professions;

public class Builder extends Engineer {
    public String typeOfConstructionWork;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void buildHouse() {
    }
}
