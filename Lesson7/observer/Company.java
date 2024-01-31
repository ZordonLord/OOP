package Lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Компания, которая нуждается в сотрудниках
 */
public class Company {

    private Publisher jobAgency;

    private String name;

    Collection<Vacancy> vacancies = new ArrayList<>();

    public Company(String name, Publisher jobAgency){
        this.jobAgency = jobAgency;
        this.name = name;

    }

    public void needEmployee(){
        for (Vacancy vacancy: vacancies){
            jobAgency.sendOffer(this.name, vacancy.getName(), vacancy.getSalary());
        }
    }

    public void addVacancy(String vacancyName, int salary){
        Vacancy vacancy = new Vacancy(vacancyName, salary);
        vacancies.add(vacancy);
    }

}
