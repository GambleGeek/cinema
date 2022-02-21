package org.cinema;

import org.cinema.models.Customer;
import org.cinema.models.Purchase;
import org.cinema.models.Show;
import org.cinema.models.Worker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Show show = context.getBean("show", Show.class);
        show.showInfo();

        Worker worker = context.getBean("worker", Worker.class);
        worker.chooseShow();

        Purchase purchase = context.getBean("purchase", Purchase.class);
        purchase.setCustomer(worker.buyTicket());

        worker.printCheck(purchase.getCustomer().getName(), purchase.getReservedSeat().getShow().getFilm().getName(), purchase.getReservedSeat().getSeat().getRow(), purchase.getReservedSeat().getSeat().getSeat());
    }
}
