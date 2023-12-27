package Lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

//    public BottleOfMilk getBottleOfMilk(double volume){
//        for (Product product : products){
//            if (product instanceof BottleOfMilk){
//                BottleOfMilk milk = (BottleOfMilk)product;
//                if (milk.getVolume() == volume)
//                    return milk;
//            }
//        }
//        return null;
//    }

    public void allProducts(){
        for (Product product : products) {
            System.out.println(product.displayInfo());
        }
    }
    public BottleOfWater getBottleOfWater() {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                return bottleOfWater;
            }
        }
        return null;
    }
    public BottleOfMilk getBottleOfMilk(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (volume == bottleOfMilk.getVolume()) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public BottleOfSoda getBottleOfSoda(String taste) {
        for (Product product : products) {
            if (product instanceof BottleOfSoda) {
                BottleOfSoda bottleOfSoda = (BottleOfSoda) product;
                if (taste.equals(bottleOfSoda.getTaste())) {
                    return bottleOfSoda;
                }
            }
        }
        return null;
    }
}
