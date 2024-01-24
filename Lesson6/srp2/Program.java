package Lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");
        Order order = new Order();
        order.inputFromConsole();
        order.saveToJson();
    }

}
