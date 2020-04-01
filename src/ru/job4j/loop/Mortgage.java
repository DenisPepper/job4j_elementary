package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        // amount - сумма выданная по кредиту
        // salary - годовой доход
        // percent - процентная ставка по кредиту
        int year = 0;
        double debt = amount + (amount * percent / 100);
        while (debt > 0) {
            debt = debt - salary;
            year++;
            debt = debt + (debt * percent / 100);
        }
        return year;
    }
}