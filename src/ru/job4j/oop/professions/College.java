package ru.job4j.oop.professions;

import ru.job4j.oop.Freshman;
import ru.job4j.oop.Student;

public class College {

    public static void main(String[] args) {

        // повышающее приведение типов
        Freshman fr = new Freshman();
        Student st = fr;
        Object obj = fr;
    }
}
