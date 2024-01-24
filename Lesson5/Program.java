package Lesson5;

import Lesson5.models.TableService;
import Lesson5.presenters.BookingPresenter;
import Lesson5.presenters.Model;
import Lesson5.views.BookingView;

import java.util.Date;

public class Program {


    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Model model = new TableService();
        BookingView view = new BookingView();

        BookingPresenter presenter = new BookingPresenter(view, model);
        presenter.updateTablesView();

        view.reservationTable(new Date(), 2, "Станислав");
        view.changeReservationTable(1001, new Date(), 4, "Станислав");
    }

}
