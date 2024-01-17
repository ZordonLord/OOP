package Lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }
    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата: %.2f руб./мес; оплата/час: %.2f",
                surName, name, age, calculateSalary(), salary);
    }
}
