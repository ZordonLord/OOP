package Lesson5.presenters;

import Lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showChangeReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);


}
