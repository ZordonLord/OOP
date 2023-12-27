package Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                new BottleOfMilk("Молоко #2", "ООО Источник", 280, 1.0, 1);
        Product bottleOfMilk3 =
                new BottleOfMilk("Молоко #3", "ООО Источник", 150, 1.5, 5);
        Product bottleOfMilk4 =
                new BottleOfMilk("Молоко #4", "ООО Источник", 290, 2, 25);

        Product bottleSoda1 =
                new BottleOfSoda("Кока-Кола", "Coca-Cola", 70, 0.5, "Кола");
        Product bottleSoda2 =
                new BottleOfSoda("Спрайт", "Coca-Cola", 115, 1.0, "Лемон");
        Product bottleSoda3 =
                new BottleOfSoda("Фанта", "Coca-Cola", 160, 2.0, "Апельсин");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);

        products.add(bottleSoda1);
        products.add(bottleSoda2);
        products.add(bottleSoda3);

        VendingMachine machine = new VendingMachine(products);

//        BottleOfMilk bottleOfMilkResult =  machine.getBottleOfMilk(1);
//        if (bottleOfMilkResult != null){
//            System.out.println("Вы купили:");
//            System.out.println(bottleOfMilkResult.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки с молоком нет в автомате.");
//        }

        System.out.println("1. Показать все товары");
        System.out.println("2. Выбрать воду");
        System.out.println("3. Выбрать объём молока");
        System.out.println("4. Выбрать вкус газировки");
        System.out.println("5. Выход");
        System.out.println("Введите цифру пункта меню: ");
        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            Integer choice = Integer.parseInt(scanner.next());
            if (choice == 1) {
                machine.allProducts();
            } else if (choice == 2) {
                BottleOfWater result = machine.getBottleOfWater();
                if (result != null) {
                    System.out.println("Вы купили:");
                    System.out.println(result.displayInfo());
                } else {
                    System.out.println("Такого товара нет");
                    System.exit(0);
                }
            } else if (choice == 3) {
                System.out.println("Введите объем молока: ");
                Double choiceVolume = Double.parseDouble(scanner.next());
                BottleOfMilk result = machine.getBottleOfMilk(choiceVolume);
                if (result != null) {
                    System.out.println("Вы купили:");
                    System.out.println(result.displayInfo());
                } else {
                    System.out.println("Такого товара нет");
                    System.exit(0);
                }
            } else if (choice == 4) {
                System.out.println("1. Кола");
                System.out.println("2. Лемон");
                System.out.println("3. Апельсин");
                System.out.println("выберите цифру вкуса газировки: ");
                Integer choiceNumTaste = Integer.parseInt(scanner.next());
                String choiceTaste = null;
                if(choiceNumTaste == 1){
                    choiceTaste = "Кола";
                } else if(choiceNumTaste == 2) {
                    choiceTaste = "Лемон";
                }
                else if(choiceNumTaste == 3) {
                    choiceTaste = "Апельсин";
                } else {
                    System.out.println("Такого пункта нет");
                    System.exit(0);
                }
                BottleOfSoda result = machine.getBottleOfSoda(choiceTaste);
                if (result != null) {
                    System.out.println("Вы купили:");
                    System.out.println(result.displayInfo());
                } else {
                    System.out.println("Такого товара нет");
                    System.exit(0);
                }
            } else if (choice == 5) {
                System.exit(0);
            } else {
                System.out.println("Такого пункта нет");
                System.exit(0);
            }
        }

    }

}
