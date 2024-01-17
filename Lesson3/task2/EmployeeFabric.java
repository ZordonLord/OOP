package Lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    public static Worker generateWorker() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 80);
        return new Worker(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                salary,
                age);
    }

    public static Freelancer generateFreelancer() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(360, 721);
        int age = random.nextInt(18, 80);
        return new Freelancer(
                names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                salary,
                age);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            int typeEmployee = random.nextInt(2);
            if(typeEmployee == 0) employees[i] = generateWorker();
            else employees[i] = generateFreelancer();
        }
        return employees;
    }

}
