package ru.job4j.oop.encapsulation;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("123456");
        student.setEnrolmentDate(new Date());
        System.out.println("STUDENT: " + student.getFio() + ", GROUP: " + student.getGroup() + ", ENROLL AT: " + student.getEnrolmentDate());
    }
}
