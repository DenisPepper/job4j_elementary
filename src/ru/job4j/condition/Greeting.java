package ru.job4j.condition;
import java.util.Calendar;

public class Greeting {

    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        idea += year;
        System.out.println(idea);
    }
}
