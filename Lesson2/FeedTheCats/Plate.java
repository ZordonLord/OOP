package Lesson2.FeedTheCats;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
        if (this.food < 0) this.food = 0;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
        if (this.food < 0) this.food = 0;
    }

    public void addFood(int addFood) {
        if (addFood > 0) this.food += addFood;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды");
    }
}
