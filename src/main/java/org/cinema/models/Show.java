package org.cinema.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Show {
    @Value("12:00")
    private String time;
    private Film film;
    private Auditorium auditorium;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    @Autowired
    public void setFilm(Film film) {
        this.film = film;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    @Autowired
    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public void showInfo(){
        System.out.println("The information about the film: ");
        film.showFilm();
        System.out.println("\n===================================");
        System.out.println("The information about the auditorium: ");
        auditorium.showAuditorium();
    }


}
