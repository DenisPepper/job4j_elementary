package ru.job4j.oop.professions;

public class Engineer extends Profession {
    public String qualification;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void solveTasks() {
    }
}
