package Lesson2.FeedTheCats;

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
        Feed.feedCat(cats, plate);
        System.out.println("----------");

        for (Cat cat : cats) {
            cat.info();
        }

        plate.info();

        Feed.addFood(cats, plate);

        plate.info();

        System.out.println("----------");
        Feed.feedCat(cats, plate);
        System.out.println("----------");

        for (Cat cat : cats) {
            cat.info();
        }

        plate.info();
    }
}
