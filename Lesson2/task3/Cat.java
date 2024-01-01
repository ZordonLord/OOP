package Lesson2.task3;

import Lesson2.task2.BaseCat;

public class Cat extends BaseCat implements Runner {

    private String name;
    private int maxRun;
    private int maxJump;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }


}
