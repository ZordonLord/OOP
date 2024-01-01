package Lesson2.FeedTheCats;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public boolean isSatiety() {
        return satiety;
    }
    public void info() {
        System.out.println("Кот: " + name + "; аппетит: " + appetite + "; сытость: " + satiety);
    }

    public boolean eat(int feed) {
        if (this.satiety) return false;
        if (feed - this.appetite >= 0) {
            this.satiety = true;
            return true;
        }
        return false;
    }
}

