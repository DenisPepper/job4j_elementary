package ru.job4j.oop.professions;

public class Programmer extends Engineer {
    public String computerLanguage;

    public Programmer(String name, String surname, String education, String birthday, String qualification) {
        super(name, surname, education, birthday, qualification);
    }

    public void createComputerProgram() {
    }
}
