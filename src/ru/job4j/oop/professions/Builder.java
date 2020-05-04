package ru.job4j.oop.professions;

public class Builder extends Engineer {
    private String typeOfConstructionWork;

    public Builder(String name, String surname, String education, String birthday, String qualification, String typeOfConstructionWork) {
        super(name, surname, education, birthday, qualification);
        this.typeOfConstructionWork = typeOfConstructionWork;
    }

    public void buildHouse() {
    }
}
