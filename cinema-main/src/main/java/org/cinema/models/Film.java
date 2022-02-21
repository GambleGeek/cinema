package org.cinema.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Film {
    @Value("Interstellar")
    private String name;
    @Value("Drama")
    private String genre;
    @Value("When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.")
    private String description;
    @Value("169")
    private Integer duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void showFilm(){
        System.out.printf("The name: %s" +
                "\nThe Genre: %s" +
                "\nThe Description: %s" +
                "\nThe Duration: %d min", name, genre, description, duration);
    }
}
