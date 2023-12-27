package Lesson1;

public class BottleOfSoda extends Product{
    private double volume;
    private String taste;

    public BottleOfSoda(String name, String brand, double price, double volume, String  taste) {
        super(name, brand, price);
        this.taste = taste;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    @Override
    public String displayInfo() {
        return String.format("[Газировка] %s - %s - %.2f; Объем: %.2f; Вкус: %s",
                name, brand, price, volume, taste);
    }
}
