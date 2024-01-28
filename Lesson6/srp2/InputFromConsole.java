package Lesson6.srp2;

import java.util.Scanner;

public class InputFromConsole {
    private final Scanner scanner = new Scanner(System.in,"cp866");

    public InputFromConsole(Order order) {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
