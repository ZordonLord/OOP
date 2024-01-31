package Lesson7.observer;

public class Program {
    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher);
        Company yandex = new Company("Yandex", publisher);
        Company geekBrains = new Company("GeekBrains", publisher);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Middle middle1 = new Middle("Мидл #1");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(middle1);

        google.addVacancy("Vacancy #1", 30500);
        google.addVacancy("Vacancy #2", 90000);
        yandex.addVacancy("Vacancy #1", 80000);
        geekBrains.addVacancy("Vacancy #1", 60000);
        google.addVacancy("Vacancy #3", 120000);

        google.needEmployee();
        yandex.needEmployee();
        geekBrains.needEmployee();

    }

}
