package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String name;
    public String surname;
    private Address address;
    private List<Reservation> reservations;

    public Customer(String name, String surname, String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation getReservation(int index) {
        return reservations.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
