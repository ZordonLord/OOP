package Lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(10);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по Фамилии/Имени:");
        System.out.println("***");

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по возрасту:");
        System.out.println("***");

        Arrays.sort(employees,new AgeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
