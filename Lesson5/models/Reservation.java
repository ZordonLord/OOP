package Lesson5.models;

import java.util.Date;
import java.util.Locale;

public class Reservation {

    private static int counter = 1000;

    private int id;

    private Date date;

    private String name;

    private Table table;

    public Reservation(Table table, Date date, String name) {
        id = ++counter;
        this.table = table;
        this.date = date;
        this.name = name;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Table getTable() {
        return table;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "бронь: %d на имя: %s", id, name);
    }
}
