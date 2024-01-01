package Lesson2.FeedTheCats;

import java.util.List;

public class Feed {
    public static void feedCat(List<Cat> cats, Plate plate) {
        for (Cat cat : cats)
            if (cat.eat(plate.getFood())) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println(cat.getName() + " поел");
            } else System.out.println(cat.getName() + " не поел");
    }

    public static void addFood(List<Cat> cats, Plate plate) {
        int needFood = 0;
        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                needFood += cat.getAppetite();
            }
        }

        if (plate.getFood() < needFood) {
            int addFood = 0;
            addFood = needFood - plate.getFood();
            plate.addFood(addFood);
            System.out.println("Добавлено " + addFood + " еды");
        }
    }
}
