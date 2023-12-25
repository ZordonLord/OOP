package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product(null, "ООО Источник", -200);
        System.out.println(product1.displayInfo());

        //product1.name = "Бутылка с молоком";
        //product1.name = null;
        //product1.brand = "~";
        product1.setPrice(0);
        System.out.println(product1.displayInfo());


        //Product product2 = new Product();
        //System.out.println(product2.displayInfo());
        Product product3 = new Product("Бутылка с молоком", 250);
        System.out.println(product3.displayInfo());
        //Product product4 = new Product();

        Product bottleOfWater1 =
                new BottleOfWater("Вода #1", "ООО Источник", 250, 0.5);

        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("Молоко #1", "ООО Источник", 250, 0.5, 25);

        Product bottleOfMilk2 =
                new BottleOfMilk("Молоко #2", "ООО Источник", 280, 1.5, 1);

        Product bottleOfMilk3 =
                new BottleOfMilk("Молоко #3", "ООО Источник", 150, 1.5, 5);

        Product bottleOfMilk4 =
                new BottleOfMilk("Молоко #4", "ООО Источник", 290, 2, 25);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);

        VendingMachine machine = new VendingMachine(products);

        BottleOfMilk bottleOfMilkResult =  machine.getBottleOfMilk(3.5);
        if (bottleOfMilkResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilkResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

    }

}
