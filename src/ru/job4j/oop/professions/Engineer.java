package ru.job4j.oop.professions;

public class Engineer extends Profession {
    public String qualification;

    public Engineer(String name, String surname, String education, String birthday, String qualification) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public void solveTasks() {
    }
}
