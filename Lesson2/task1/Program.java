package Lesson2.task1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Персик", "Рыжий");

        Animal a1 = cat1;
        Object o1 =  cat1;

        //cat1.jump();
        Animal dog1 = new Dog("Шарик", 12);


        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);

        processVoice(animals);
    }

    static void processVoice(List<Animal> animals){
        for (Animal animal: animals) {

            if (animal instanceof Cat){
                Cat cat1 = (Cat) animal;
                System.out.println("Цвет котика: " + cat1.getColor());
            }
            if (animal instanceof Dog){
                Dog dog1 = (Dog)animal;
                System.out.println("Вес собаки: " + dog1.getWeight());
            }

            animal.voice();
            animal.jump();
        }
    }

}
