package Lesson7.observer;

public class Middle implements Observer {
    private String name;
    private int salary;

    public Middle(String name){
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(String nameCompany, String vacancyName, int salary) {
        if (this.salary <= salary){
            System.out.printf("Мидл %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Мидл %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyName, salary);
        }
    }
}
