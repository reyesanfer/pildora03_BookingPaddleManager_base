package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaddleManager {

    private List<Customer> customers;
    private List<Court> courts;

    public PaddleManager() {
        this.customers = new ArrayList<>();
        this.courts = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, String street, int number, int postalCode, String city) {
        customers.add(new Customer(name, surname, street, number, postalCode, city));
    }

    public void addMember(String name, String surname, String street, int number, int postalCode, String city, int points) {
        customers.add(new Member(name, surname, street, number, postalCode, city, points));
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public void addCourt(String name, int price, CourtType type) {
        courts.add(new Court(name, price, type));
    }

    public Court getCourt(int index) {
        return courts.get(index);
    }

    public void reserve(Customer customer, Court court, Date date, int hours) {
        Reservation reservation = new Reservation(date, hours, court);
        customer.addReservation(reservation);
    }

}
