package Lesson4.homework;

import Lesson2.task1.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{

    private String name;
    private ArrayList<T> arrayList = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Add(T fruit) {
        arrayList.add(fruit);
    }

    public float getWeight(){
        float weight = 0;
        if (!arrayList.isEmpty()) {
            weight = arrayList.size() * arrayList.get(0).getWeight();
        }
        return weight;
    }
    public boolean compare(Box array) {
        if (getWeight() == array.getWeight()) return true;
        return false;
    }

    public void transfer(Box<T> array) {
        for (T fruit: arrayList) {
            array.Add(fruit);
        }
        arrayList.clear();
    }

    @Override
    public String toString() {
        return String.format("Коробка %s; %d штук; %.2f вес", getName(), arrayList.size(), getWeight());
    }
}
