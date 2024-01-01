package Lesson2.task2;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Runnable cat1 = new Cat();
        Runnable dog1 = new Dog();

        ArrayList<Runnable> animalsList = new ArrayList<>();
        animalsList.add(cat1);
        animalsList.add(dog1);

        processRun(animalsList);
    }

    static void processRun(List<Runnable> animals){
        for (Runnable runnable : animals){
            runnable.run();
        }
    }

}
