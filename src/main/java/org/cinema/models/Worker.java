package org.cinema.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@Component
public class Worker {
    @Value("Eren")
    private String name;
    private Seat seat;

    Scanner in = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWorker(Worker worker){
        System.out.println("Добавлен новый Worker!");
    }

    public Seat getSeat() {
        return seat;
    }

    @Autowired
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void chooseShow() {
        System.out.println("\n\nDo you want to buy a ticket? yes/no");
        String q1 = in.nextLine();

        if (q1.equals("yes"))
            seat.showSeat();
        else if (q1.equals("no")) {
            System.out.println("Okay.");
            System.exit(0);
        } else {
            System.out.println("Error");
            System.exit(0);
        }
    }

    public Customer buyTicket(){

        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your age: ");
        Integer age = in.nextInt();

        Customer customer = new Customer(name, age);
        return customer;
    }

    public void printCheck(String customer_name, String film_name, Integer row_number, Integer seat_number) {
//        String customer_name = "Salmoor";
        String ticket_price = "10$";
//        String film_name = "Interstellar";
//        Integer row_number = 5;
//        Integer seat_number = 22;

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();

        System.out.println(GREEN_BOLD + "You have bought a ticket! Enjoy your watching!" + RESET);

        System.out.println("================================" +
                PURPLE_BOLD + "\nTICKET" + RESET + "                         |" + "\n================================" +
                RED_BOLD + "\n  Customer: " + RESET + customer_name + "         |" +
                YELLOW_BOLD + "\n  Film: " + RESET + film_name + "           |" +
                YELLOW_BOLD + "\n  Price: " + RESET + ticket_price + "                   |" +
                YELLOW_BOLD + "\n  Row: " + RESET + row_number + "                       |" +
                YELLOW_BOLD + "\n  Seat: " + RESET + seat_number + "                     |" +
                YELLOW_BOLD + "\n  Time: " + RESET + formatter.format(time) + "               |" +
                "\n================================");
    }
    public static final String RESET = "\u001B[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String YELLOW_BOLD = "\033[1;33m";
}
