package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PaddleManager manager = new PaddleManager();
        manager.addCustomer("Juan", "Perez", "Gran Via", 123, 28013, "Madrid");
        manager.addMember("Ana", "Gomez", "Tomás Morales", 11, 35000, "LPGC", 0);
        manager.addCourt("Central Court", 20, CourtType.FAST_COURT);
        manager.addCourt("Training Court", 15, CourtType.SLOW_COURT);
        Customer customer1 = manager.getCustomer(0);
        Customer customer2 = manager.getCustomer(1);
        manager.reserve(customer1, manager.getCourt(0), new Date(), 2);
        manager.reserve(customer2, manager.getCourt(1), new Date(), 1);
        Reservation reserve1 = customer1.getReservation(0);
        System.out.println(reserve1.toString());
        System.out.println("Price: " + reserve1.price() + " euros");
        Reservation reserve2 = customer2.getReservation(0);
        System.out.println(reserve2.toString());
        System.out.println("Price: " + reserve2.price() + " euros");
    }
}
