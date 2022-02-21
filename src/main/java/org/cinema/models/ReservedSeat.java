package org.cinema.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReservedSeat {
    private Seat seat;
    private Show show;

    public void addReservedSeat(ReservedSeat reservedSeat){

    }

    public Seat getSeat() {
        return seat;
    }

    @Autowired
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Show getShow() {
        return show;
    }

    @Autowired
    public void setShow(Show show) {
        this.show = show;
    }
}
