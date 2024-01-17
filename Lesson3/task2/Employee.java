package Lesson3.task2;

/**
 * Рабочий (базовый тип)
 */
public abstract class Employee implements Comparable<Employee> {

    //region Поля

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Возраст
     */
    protected int age;

    //endregion

    //region Конструкторы

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    //endregion

    //region Публичные методы

    @Override
    public int compareTo(Employee o) {

        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    //endregion

}
