package Lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk milk = (BottleOfMilk)product;
                if (milk.getVolume() == volume)
                    return milk;
            }
        }
        return null;
    }


}
