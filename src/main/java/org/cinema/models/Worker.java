package org.cinema.models;

import org.springframework.stereotype.Component;

@Component
public class Worker {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWorker(Worker worker){
        System.out.println("Добавлен новый Worker!");
    }
}
