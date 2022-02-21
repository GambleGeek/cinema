package org.cinema.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Auditorium {
    @Value("20")
    private Integer numberOfSeats;
    @Value("VIP")
    private String type;

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showAuditorium(){
        System.out.printf("Number of seats: %d" +
                "\nType of auditorium: %s", numberOfSeats, type);
    }
}
