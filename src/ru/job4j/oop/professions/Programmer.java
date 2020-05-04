package ru.job4j.oop.professions;

public class Programmer extends Engineer {
    private String computerLanguage;

    public Programmer(String name, String surname, String education, String birthday, String qualification, String computerLanguage) {
        super(name, surname, education, birthday, qualification);
        this.computerLanguage = computerLanguage;
    }

    public void createComputerProgram() {
    }
}
