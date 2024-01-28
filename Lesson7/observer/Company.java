package Lesson7.observer;

import java.util.Random;

/**
 * Компания, которая нуждается в сотрудниках
 */
public class Company {

    private Random random = new Random();
    private Publisher jobAgency;

    private String name;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

}
