package Lesson4.task2;

public class Program {

    public static void main(String[] args) {
        Person person1 = new Person("FIO #1", "1000002340");
        Entity entity1 = new Entity("ENTITY #1", "1000000451");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 30);
        DebitAccount<Entity> debitAccount1 = new DebitAccount<>(entity1, 3000000);
        Transaction<Account<?>> transaction = new Transaction<>(debitAccount1, creditAccount1, 15000);
        transaction.execute();
        transaction.execute();
        transaction.execute();
    }

}
