package ru.job4j.loop;

public class Mortgage {
    /*
    amount - сумма выданная по кредиту
    salary - годовой доход
    percent - процентная ставка по кредиту
    */
    public int year(int amount, int salary, double percent) {
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