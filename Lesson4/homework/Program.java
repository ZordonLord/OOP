package Lesson4.homework;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Box<Orange> boxOrange1 = new Box<>("boxOrange1");
        boxOrange1.Add(orange1);
        boxOrange1.Add(orange2);
        boxOrange1.Add(orange3);

        Box<Apple> boxApple1 = new Box<>("boxApple1");
        boxApple1.Add(apple1);
        boxApple1.Add(apple2);
        boxApple1.Add(apple3);
        boxApple1.Add(apple4);

        Box<Apple> boxApple2 = new Box<>("boxApple2");

        System.out.println(boxOrange1);
        System.out.println(boxApple1);
        System.out.println(boxApple2);

        System.out.println(boxOrange1.compare(boxApple1));

        boxApple1.transfer(boxApple2);

        System.out.println(boxApple1);
        System.out.println(boxApple2);



    }
}
