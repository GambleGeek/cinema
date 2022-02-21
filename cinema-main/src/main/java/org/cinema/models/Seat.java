package org.cinema.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Seat {
    @Value("25")
    private Integer seat;
    @Value("7")
    private Integer row;
    private Auditorium auditorium;

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    @Autowired
    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public void showSeat(){
        System.out.println("Seat number: " + seat);
        System.out.println("Row number: " + row);
        System.out.println("Auditorium: " + auditorium.getType());
    }

}
