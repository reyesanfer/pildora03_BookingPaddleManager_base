package org.ulpgc.is1.model;

import java.util.Date;

public class Reservation {

    private static int NEXT_ID = 0;
    public final int id;
    public Date date;
    public int hours;
    private Court court;

    public Reservation(Date date, int hours, Court court) {
        this.id = NEXT_ID++;
        this.date = date;
        this.hours = hours;
        this.court = court;
    }

    public int price() {
        return court.getPrice() * hours;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + id + ", Date: " + date + ", Hours: " + hours + ", Court: " + court.getName();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    public Court getCourt() {
        return court;
    }

}
