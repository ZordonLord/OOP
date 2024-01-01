package Lesson2.task1;

public class Dog extends Animal {

    private double weight;

    public Dog(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Собака подает голос");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }
}
