package org.cinema.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;

@Component
public class Purchase {
    private Customer customer;
    private ReservedSeat reservedSeat;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ReservedSeat getReservedSeat() {
        return reservedSeat;
    }

    @Autowired
    public void setReservedSeat(ReservedSeat reservedSeat) {
        this.reservedSeat = reservedSeat;
    }

    public void addPurchase(Purchase purchase){

    }

}
