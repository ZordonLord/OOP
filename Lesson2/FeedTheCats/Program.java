package Lesson2.FeedTheCats;

import Lesson1.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 10, false);
        Cat cat2 = new Cat("Tom", 15, false);
        Cat cat3 = new Cat("Kitty", 20, false);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        Plate plate = new Plate(15);

        for (Cat cat : cats) {
            cat.info();
        }

        plate.info();

        System.out.println("----------");

        for (Cat cat : cats) {
            if(cat.eat(plate.getFood())) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println(cat.getName() + " поел");
            } else System.out.println(cat.getName() + " не поел");
        }

        System.out.println("----------");

        for (Cat cat : cats) {
            cat.info();
        }

        plate.info();

        int needFood = 0;
        for (Cat cat : cats) {
                if (!cat.isSatiety()) {
                needFood += cat.getAppetite();
            }
        }
        plate.setFood(needFood);
        System.out.println("Добавлено " + needFood + " еды");
    }
}
