package Lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, String vacancyName, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, vacancyName, salary);
        }
    }
}
