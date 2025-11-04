package org.ulpgc.is1.model;

public class Member extends Customer {

    public int points;

    public Member(String name, String surname, String street, int number, int postalCode, String city, int points) {
        super(name, surname, street, number, postalCode, city);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
